package com.example.user.exampleproject.presenter;

import com.example.user.exampleproject.view.IBFragmentView;

/**
 * Created by user on 31.07.17.
 */

public class IBFragmentPresenterImpl implements IBFragmentPresenter {
    private IBFragmentView view;
    @Override
    public void init(IBFragmentView view) {
        this.view = view;
    }
}
