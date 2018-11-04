package com.sqisland.android.test_demo;

import javax.inject.Inject;

class MainPresenter {

    private final MainUI notePagingUI;

    @Inject
    public MainPresenter(MainUI notePagingUI) {
        this.notePagingUI = notePagingUI;
    }

    void destroy() {
    }

    void delete(String noteObjectId) {

    }

    void handleError(Throwable throwable) {
        notePagingUI.handleError(throwable);
    }

    public interface MainUI {

        void handleError(Throwable e);
    }


}
