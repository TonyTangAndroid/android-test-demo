package com.sqisland.android.test_demo;

import dagger.Module;
import dagger.Provides;

@Module
public class ClockModule {
    @Provides
    @AppScope
    Clock provideClock() {
        return new Clock();
    }
}