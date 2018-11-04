package com.sqisland.android.test_demo;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import org.joda.time.DateTime;

import javax.inject.Inject;

public class MainActivity extends Activity implements MainPresenter.MainUI {
    public static final String KEY_MILLIS = "millis";

    @Inject
    Clock clock;

    @Inject
    MainPresenter mainPresenter;

    @Inject
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        inject();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.date);
        long millis = getIntent().getLongExtra(KEY_MILLIS, -1);
        DateTime dateTime = (millis > 0) ? new DateTime(millis) : clock.getNow();
        textView.setText(DateUtils.format(dateTime));
    }

    public void callPresenterMethod() {
        mainPresenter.callPresenterMethod();
    }

    @Override
    public void handleError(Throwable e) {

    }

    private void inject() {
        ((App) getApplication()).getFragmentInjector().inject(this);
    }


}