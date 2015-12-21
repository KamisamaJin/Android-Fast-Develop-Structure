package com.jin.pretty;

import android.databinding.ViewDataBinding;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jin.pretty.databinding.FragmentMainBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends BaseFragment {
    FragmentMainBinding mBinding;

    public MainActivityFragment() {
    }



    @Override
    protected int getContentRes() {
        return R.layout.fragment_main;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding = getDataBinding();
        //mBinding.imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
    }

}
