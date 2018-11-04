package com.sqisland.android.test_demo;

import android.app.Application;
import android.content.SharedPreferences;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component(modules = {SharedPrefModule.class, ClockModule.class})
public interface DemoComponent {

    Clock clock();

    SharedPreferences sharedPreferences();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        DemoComponent build();
    }
}
