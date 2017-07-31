package com.example.user.exampleproject.di.modules;

import com.example.user.exampleproject.presenter.MainActivityPresenterImpl;
import com.example.user.exampleproject.view.IMainActivityView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user on 31.07.17.
 */
@Module
public class MainActivityModule {
    private IMainActivityView view;

    public MainActivityModule(IMainActivityView view) {
        this.view = view;
    }

    @Provides
    public IMainActivityView provideView() {
        return view;
    }
}
