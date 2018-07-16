package id.pahlevikun.daggersample;

import android.app.Application;

import id.pahlevikun.daggersample.dagger.DaggerMyComponent;
import id.pahlevikun.daggersample.dagger.MyComponent;
import id.pahlevikun.daggersample.dagger.MyModule;

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = createMyComponent();
    }

    MyComponent getMyComponent() {
        return myComponent;
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent.builder().myModule(new MyModule(this)).build();
    }
}
