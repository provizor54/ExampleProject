package com.example.user.exampleproject.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.user.exampleproject.App;
import com.example.user.exampleproject.di.components.IAppComponent;

/**
 * Created by user on 31.07.17.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent(App.get(this).getAppComponent());
    }

    protected abstract void setupComponent(IAppComponent appComponent);
}
