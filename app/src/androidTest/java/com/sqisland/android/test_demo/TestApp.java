package com.sqisland.android.test_demo;


public class TestApp extends App {

    @Override
    protected TestAppComponent createComponent() {
        return DaggerTestAppComponent.builder()
                .mockClockModule(new MockClockModule())
                .mockPresenterModule(new MockPresenterModule())
                .application(this).build();
    }

    public TestAppComponent component() {
        return (TestAppComponent) super.component();
    }

}
