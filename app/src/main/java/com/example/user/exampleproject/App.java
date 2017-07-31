package com.example.user.exampleproject;

import android.app.Application;
import android.content.Context;

import com.example.user.exampleproject.di.components.DaggerIAppComponent;
import com.example.user.exampleproject.di.components.IAppComponent;
import com.example.user.exampleproject.di.modules.AppModule;

/**
 * Created by user on 31.07.17.
 */

public class App extends Application {
    private IAppComponent appComponent;

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        buildGraphAndInject();
    }

    public IAppComponent getAppComponent() {
        return appComponent;
    }

    public void buildGraphAndInject() {
        appComponent = DaggerIAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);
    }
}
