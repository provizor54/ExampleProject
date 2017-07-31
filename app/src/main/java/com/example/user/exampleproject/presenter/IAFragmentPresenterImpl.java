package com.example.user.exampleproject.presenter;

import android.util.Log;

import com.example.user.exampleproject.view.IAFragmentView;

/**
 * Created by user on 31.07.17.
 */

public class IAFragmentPresenterImpl implements IAFragmentPresenter {
    private IAFragmentView view;

    @Override
    public void init(IAFragmentView view) {
        this.view = view;
    }

    @Override
    public void onResume() {
        Log.d("myLogs", "onResume");
    }

    @Override
    public void onPause() {
        Log.d("myLogs", "onPause");
    }
}
