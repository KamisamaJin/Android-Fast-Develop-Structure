package com.jin.pretty.image;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by Jin on 12/7/15.
 */
public final class ImageLoader {
    //-------------- Context --------------
    public static void load(Context context, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(context)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .into(imageView);
    }

    public static void loadCrop(Context context, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(context)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .centerCrop()
                .into(imageView);
    }

    //-------------- Activity --------------
    public static void load(Activity activity, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(activity)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .into(imageView);
    }

    public static void loadCrop(Activity context, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(context)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .centerCrop()
                .into(imageView);
    }

    //-------------- FragmentActivity --------------
    public static void load(FragmentActivity activity, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(activity)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .into(imageView);
    }

    public static void loadCrop(FragmentActivity activity, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(activity)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .centerCrop()
                .into(imageView);
    }
    //-------------- Fragment --------------
    public static void load(Fragment fragment, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(fragment)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .into(imageView);
    }

    public static void loadCrop(Fragment fragment, String imageUrl, ImageView imageView, int placeHolder, int error) {
        if (TextUtils.isEmpty(imageUrl)) {
            imageView.setImageResource(error);
            return;
        }
        Glide.with(fragment)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(placeHolder)
                .error(error)
                .centerCrop()
                .into(imageView);
    }


}
