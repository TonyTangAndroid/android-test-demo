package com.sqisland.android.test_demo;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface ActivityComponent extends ActivityInjector {
}
