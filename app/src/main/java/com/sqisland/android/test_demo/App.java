package com.sqisland.android.test_demo;

import android.app.Application;

public class App extends Application {

    private AppComponent component = createComponent();

    protected AppComponent createComponent() {
        return DaggerAppComponent
                .builder()
                .application(this)
                .build();
    }

    public ActivityInjector activityInjector() {
        return DaggerActivityComponent.builder()
                .appComponent(this.component).build();
    }

    public AppComponent component() {
        return component;
    }
}