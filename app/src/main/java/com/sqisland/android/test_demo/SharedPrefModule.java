package com.sqisland.android.test_demo;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

@Module(includes = ContextModule.class)
public class SharedPrefModule {
    @Provides
    @ApplicationScope
    SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("pref_monkey.xml", Context.MODE_PRIVATE);
    }
}