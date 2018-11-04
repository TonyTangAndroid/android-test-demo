package com.sqisland.android.test_demo;


public class TestMockerApplication extends DemoApplication {

    @Override
    public ActivityInjector getFragmentInjector() {
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
                .application(this).build();
    }

}
