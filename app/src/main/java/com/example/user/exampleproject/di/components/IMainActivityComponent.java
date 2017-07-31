package com.example.user.exampleproject.di.components;

import com.example.user.exampleproject.MainActivity;
import com.example.user.exampleproject.di.ActivityScope;
import com.example.user.exampleproject.di.components.IAppComponent;
import com.example.user.exampleproject.di.modules.MainActivityModule;

import dagger.Component;

/**
 * Created by user on 31.07.17.
 */

@ActivityScope
@Component(dependencies = IAppComponent.class, modules = MainActivityModule.class)
public interface IMainActivityComponent {
    void inject(MainActivity activity);
}
