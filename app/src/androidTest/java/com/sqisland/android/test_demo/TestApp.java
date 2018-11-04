package com.sqisland.android.test_demo;


public class TestApp extends App {

    @Override
    public ActivityInjector activityInjector() {
        return DaggerTestMockerComponent.builder()
                .testAppComponent((TestAppComponent) component()).build();
    }

    public TestActivityInjector testActivityInjector() {
        return DaggerTestMockerComponent.builder()
                .testAppComponent((TestAppComponent) component()).build();
    }

    @Override
    protected TestAppComponent createComponent() {
        return DaggerTestAppComponent.builder()
                .mockClockModule(new MockClockModule())
                .mockPresenterModule(new MockPresenterModule())
                .application(this).build();
    }

}
