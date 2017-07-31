package com.example.user.exampleproject;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

import com.example.user.exampleproject.common.BaseActivity;
import com.example.user.exampleproject.di.IHasComponent;
import com.example.user.exampleproject.di.components.DaggerIAppComponent;
import com.example.user.exampleproject.di.components.DaggerIMainActivityComponent;
import com.example.user.exampleproject.di.components.IAppComponent;
import com.example.user.exampleproject.di.components.IMainActivityComponent;
import com.example.user.exampleproject.di.modules.MainActivityModule;
import com.example.user.exampleproject.presenter.MainActivityPresenterImpl;
import com.example.user.exampleproject.view.IMainActivityView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainActivityView, IHasComponent<IMainActivityComponent> {
    @Inject
    MainActivityPresenterImpl presenter;
    private IMainActivityComponent mainActivityComponent;
    private FragmentManager fragmentManager;
    private Button changeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment = (Button) findViewById(R.id.changeFragment);
        changeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.replaceFragment();
            }
        });
    }

    @Override
    public IMainActivityComponent getComponent() {
        return mainActivityComponent;
    }

    @Override
    public void popFragmentFromStack() {
        fragmentManager.popBackStack();
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {
        mainActivityComponent = DaggerIMainActivityComponent.builder()
                .iAppComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build();

        mainActivityComponent.inject(this);
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}
