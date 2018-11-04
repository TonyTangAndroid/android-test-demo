package com.sqisland.android.test_demo;

import dagger.Component;

@ActivityScope
@Component(dependencies = TestAppComponent.class)
public interface TestMockerComponent extends ActivityInjector, TestActivityInjector {
}
