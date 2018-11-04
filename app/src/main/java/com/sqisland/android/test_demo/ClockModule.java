package com.sqisland.android.test_demo;

import dagger.Module;
import dagger.Provides;

@Module
public class ClockModule {
    @Provides
    @ApplicationScope
    Clock provideClock() {
        return new Clock();
    }
}