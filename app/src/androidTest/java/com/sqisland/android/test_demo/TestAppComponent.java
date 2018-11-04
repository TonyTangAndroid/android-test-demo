package com.sqisland.android.test_demo;

import android.app.Application;
import android.content.SharedPreferences;

import dagger.BindsInstance;
import dagger.Component;

@AppScope
@dagger.Component(modules = {PrefModule.class, MockClockModule.class, MockPresenterModule.class})
public interface TestAppComponent extends AppComponent {

    Clock clock();

    MainPresenter mainPresenter();

    SharedPreferences sharedPreferences();

    @Component.Builder
    interface TestBuilder extends Builder {

        @BindsInstance
        TestBuilder mockClockModule(MockClockModule clockModule);

        @BindsInstance
        TestBuilder mockPresenterModule(MockPresenterModule mockPresenterModule);

        @BindsInstance
        TestBuilder application(Application application);

        TestAppComponent build();

    }
}
