package com.sqisland.android.test_demo;

import android.app.Application;

public class DemoApplication extends Application {

    private DemoComponent component = createComponent();

    protected DemoComponent createComponent() {
        return DaggerDemoComponent
                .builder()
                .application(this)
                .build();
    }

    public DemoComponent component() {
        return component;
    }
}