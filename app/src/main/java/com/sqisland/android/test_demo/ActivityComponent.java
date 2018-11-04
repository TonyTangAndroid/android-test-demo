package com.sqisland.android.test_demo;

import dagger.Component;

@ActivityScope
@Component(dependencies = DemoComponent.class)
public interface ActivityComponent extends ActivityInjector {
}
