package id.pahlevikun.daggersample.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import id.pahlevikun.daggersample.MainActivity;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(MainActivity mainActivity);

    Context context();
}
