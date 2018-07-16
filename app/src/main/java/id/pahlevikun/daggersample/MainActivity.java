package id.pahlevikun.daggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.Date;

import javax.inject.Inject;

import id.pahlevikun.daggersample.dagger.DaggerMyComponent;
import id.pahlevikun.daggersample.dagger.MyModule;
import id.pahlevikun.daggersample.myexample.MyExample;
import id.pahlevikun.daggersample.sharedpreferences.MySharedPreferences;

public class MainActivity extends AppCompatActivity {

    @Inject
    MyExample mMyExample;

    @Inject
    MySharedPreferences mySharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getMyComponent().inject(this);

        TextView dateTextView = findViewById(R.id.tvDate);
        mySharedPreferences.storeDate(new Date(mMyExample.getDate()).toString());

        DaggerMyComponent.builder().myModule(new MyModule(this)).build();

        dateTextView.setText(mySharedPreferences.getDate());
    }
}
