package com.jin.pretty;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jin on 12/3/15.
 */
public class BaseActivity extends AppCompatActivity {
    protected final String TAG = getClass().getSimpleName();
    protected ViewDataBinding dataBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getContentRes() > 0) {
            dataBinding =  DataBindingUtil.setContentView(this, getContentRes());
        }
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
