package com.sqisland.android.test_demo;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

@Module
public class MockPresenterModule {

    @Provides
    @AppScope
    MainPresenter provideMainPresenter() {
        return Mockito.mock(MainPresenter.class);
    }
}