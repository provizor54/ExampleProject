package com.example.user.exampleproject.di.components;

import com.example.user.exampleproject.App;
import com.example.user.exampleproject.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by user on 31.07.17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface IAppComponent {
    void inject(App app);
}
