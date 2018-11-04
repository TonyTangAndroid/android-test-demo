package com.sqisland.android.test_demo;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    @Provides
    @AppScope
    Context provideSharedPreferences(Application application) {
        return application;
    }
}