package com.sqisland.android.test_demo;

import android.app.Application;
import android.content.SharedPreferences;

import dagger.BindsInstance;
import dagger.Component;

@AppScope
@Component(modules = {PrefModule.class, ClockModule.class})
public interface AppComponent {

    Clock clock();

    SharedPreferences sharedPreferences();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
