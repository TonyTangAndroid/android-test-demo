package com.sqisland.android.test_demo;

import javax.inject.Inject;

class MainPresenter {

    private final MainUI mainUI;

    @Inject
    public MainPresenter(MainUI mainUI) {
        this.mainUI = mainUI;
    }

    void callPresenterMethod() {
    }

    void delete(String noteObjectId) {

    }

    void handleError(Throwable throwable) {
        mainUI.handleError(throwable);
    }

    public interface MainUI {

        void handleError(Throwable e);
    }


}
