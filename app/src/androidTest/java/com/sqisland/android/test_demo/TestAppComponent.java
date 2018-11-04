package com.sqisland.android.test_demo;

import android.app.Application;
import android.content.SharedPreferences;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@dagger.Component(modules = {SharedPrefModule.class, MockClockModule.class})
public interface TestAppComponent extends DemoComponent {

    Clock clock();

    MainPresenter mainPresenter();

    SharedPreferences sharedPreferences();


    @Component.Builder
    interface TestBuilder extends Builder {

        @BindsInstance
        TestBuilder mockClockModule(MockClockModule clockModule);

        @BindsInstance
        TestBuilder application(Application application);

        TestAppComponent build();

    }
}
