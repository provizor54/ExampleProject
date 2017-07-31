package com.example.user.exampleproject.view;

import android.support.v4.app.Fragment;

/**
 * Created by user on 31.07.17.
 */

public interface IMainActivityView {
    void popFragmentFromStack();
    void replaceFragment(Fragment fragment);
}
