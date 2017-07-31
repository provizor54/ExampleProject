package com.example.user.exampleproject.presenter;

import com.example.user.exampleproject.view.AFragment;
import com.example.user.exampleproject.view.BFragment;
import com.example.user.exampleproject.view.IMainActivityView;

import javax.inject.Inject;

/**
 * Created by user on 31.07.17.
 */

public class MainActivityPresenterImpl implements IMainActivityPresenter {
    private IMainActivityView view;
    private boolean toggle = false;

    @Inject
    public MainActivityPresenterImpl(IMainActivityView view) {
        this.view = view;
    }

    @Override
    public void onBackPressed() {
        view.popFragmentFromStack();
    }

    @Override
    public void replaceFragment() {
        if (toggle) {
            toggle = false;
            view.replaceFragment(new AFragment());
        } else {
            toggle = true;
            view.replaceFragment(new BFragment());
        }
    }
}
