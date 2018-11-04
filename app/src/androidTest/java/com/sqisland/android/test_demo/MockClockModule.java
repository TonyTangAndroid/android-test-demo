package com.sqisland.android.test_demo;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

@Module
public class MockClockModule {
    @Provides
    @ApplicationScope
    Clock provideClock() {
        return Mockito.mock(Clock.class);
    }

    @Provides
    @ApplicationScope
    MainPresenter provideMainPresenter() {
        return Mockito.mock(MainPresenter.class);
    }
}