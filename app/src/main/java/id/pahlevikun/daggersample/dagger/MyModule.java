package id.pahlevikun.daggersample.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import id.pahlevikun.daggersample.myexample.MyExample;
import id.pahlevikun.daggersample.myexample.MyExampleImplementation;
import id.pahlevikun.daggersample.sharedpreferences.MySharedPreferences;
import id.pahlevikun.daggersample.sharedpreferences.MySharedPreferencesImplementation;

@Module
public class MyModule {

    private Context context;

    public MyModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    static MyExample provideMyExample() {
        return new MyExampleImplementation();
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    MySharedPreferences provideMySharedPreferences() {
        return new MySharedPreferencesImplementation(context);
    }
}
