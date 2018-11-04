package com.sqisland.android.test_demo;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import javax.inject.Inject;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Inject
    Clock clock;

    @Inject
    MainPresenter mainPresenter;

    @Before
    public void setUp() {
        inject();
    }

    private void inject() {

        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        TestApp app = (TestApp) instrumentation.getTargetContext().getApplicationContext();
        app.testActivityInjector().inject(this);

    }

    @Test
    public void today() {
        Clock clock = this.clock;
        Mockito.when(clock.getNow()).thenReturn(new DateTime(2008, 9, 23, 0, 0, 0));
        activityRule.launchActivity(new Intent());
        onView(withId(R.id.date)).check(matches(withText("2008-09-23")));
    }

    @Test
    public void intent() {
        DateTime dateTime = new DateTime(2014, 10, 15, 0, 0, 0);
        Intent intent = new Intent();
        intent.putExtra(MainActivity.KEY_MILLIS, dateTime.getMillis());
        activityRule.launchActivity(intent);
        onView(withId(R.id.date)).check(matches(withText("2014-10-15")));
    }

    @Test
    public void callPresenterMethod() {
        activityRule.launchActivity(null);
        activityRule.getActivity().callPresenterMethod();
        verify(mainPresenter).callPresenterMethod();
        verifyNoMoreInteractions(mainPresenter);
    }
}