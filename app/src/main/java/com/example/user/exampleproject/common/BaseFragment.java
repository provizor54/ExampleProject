package com.example.user.exampleproject.common;

import android.support.v4.app.Fragment;

import com.example.user.exampleproject.di.IHasComponent;

/**
 * Created by user on 31.07.17.
 */

public class BaseFragment extends Fragment {
    @SuppressWarnings("unchecked")
    protected <T> T getComponent(Class<T> componentType) {
        return componentType.cast(((IHasComponent<T>) getActivity()).getComponent());
    }
}
