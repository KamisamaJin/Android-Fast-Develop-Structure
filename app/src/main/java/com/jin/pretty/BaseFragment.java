package com.jin.pretty;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jin on 12/7/15.
 */
public class BaseFragment extends Fragment {
    protected final String TAG = getClass().getSimpleName();
    protected ViewDataBinding dataBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (getContentRes() > 0) {
            dataBinding = DataBindingUtil.inflate(inflater, getContentRes(), container, false);
            return dataBinding.getRoot();
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     * 设置content resource
     * @return
     */
    protected int getContentRes() {
        return -1;
    }

    /**
     * 获取data binding
     * @param <T>
     * @return
     */
    protected <T extends ViewDataBinding> T getDataBinding() {
        T convertDataBinding = null;
        if (dataBinding != null) {
            try {
                convertDataBinding = (T) dataBinding;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return convertDataBinding;
    }

}
