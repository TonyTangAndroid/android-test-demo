package com.sqisland.android.test_demo;

public class MockDemoApplication extends DemoApplication {
    @Override
    protected TestAppComponent createComponent() {
        return DaggerTestAppComponent.builder()
                .mockClockModule(new MockClockModule())
                .application(this).build();
    }
}