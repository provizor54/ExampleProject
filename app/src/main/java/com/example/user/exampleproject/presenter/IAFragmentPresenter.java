package com.example.user.exampleproject.presenter;

import com.example.user.exampleproject.common.BaseFragmentPresenter;
import com.example.user.exampleproject.view.IAFragmentView;

/**
 * Created by user on 31.07.17.
 */

public interface IAFragmentPresenter extends BaseFragmentPresenter<IAFragmentView> {
    void onResume();
    void onPause();
}
