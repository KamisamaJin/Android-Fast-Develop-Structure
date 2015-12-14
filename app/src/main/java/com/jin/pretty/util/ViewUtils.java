package com.jin.pretty.util;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Jin on 12/14/15.
 */
public final class ViewUtils {
    public static final int ANIMATION_TIME = 300;
    public static final float ALPHA_FROM = 1.0F;
    public static final float ALPHA_TO = 0.0F;

    public static void showLoading(View loadingIndicator) {
        if (loadingIndicator != null) {
            loadingIndicator.setVisibility(View.VISIBLE);
        }
    }

    public static void hideLoading(final View loadingIndicator) {
        if (loadingIndicator != null && loadingIndicator.getVisibility() == View.VISIBLE) {
            Animation alphaAnimation = new AlphaAnimation(ALPHA_FROM, ALPHA_TO);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    loadingIndicator.setVisibility(View.GONE);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            alphaAnimation.setDuration(ANIMATION_TIME);
            loadingIndicator.startAnimation(alphaAnimation);
        }
    }


    public static int getTotalHeightOfListView(ListView listView, int maxHeight) {
        if (listView instanceof ExpandableListView) {
            ExpandableListView expandableListView = (ExpandableListView) listView;
            ExpandableListAdapter adapter = expandableListView.getExpandableListAdapter();
            int groupSize = adapter.getGroupCount();
            int totalHeight = 0;
            int dividerSize = 0;
            for (int i = 0; i < groupSize; i++) {
                View groupView = adapter.getGroupView(i, false, null, expandableListView);
                groupView.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                        View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                totalHeight += groupView.getMeasuredHeight();
                if (adapter.getChildrenCount(i) - 1 > 0) {
                    dividerSize += adapter.getChildrenCount(i) - 1;
                }
                for (int j = 0; j < adapter.getChildrenCount(i); j++) {
                    View childView = adapter.getChildView(i, j, false, null, expandableListView);
                    childView.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                    totalHeight += childView.getMeasuredHeight();
                }
            }
            totalHeight += (dividerSize + groupSize * 2) * expandableListView.getDividerHeight();
            ViewGroup.LayoutParams params = expandableListView.getLayoutParams();
            //int maxSize = DensityUtil.dip2px(listView.getContext(), 400);
            if (totalHeight > maxHeight && maxHeight !=0) {
                totalHeight = maxHeight;
            }
            params.height = totalHeight;
            expandableListView.setLayoutParams(params);
            return params.height;
        } else {
            ListAdapter mAdapter = listView.getAdapter();

            int totalHeight = 0;

            for (int i = 0; i < mAdapter.getCount(); i++) {
                View mView = mAdapter.getView(i, null, listView);

                mView.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                        View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                totalHeight += mView.getMeasuredHeight();
                //Log.w("HEIGHT" + i, String.valueOf(totalHeight));
            }

            ViewGroup.LayoutParams params = listView.getLayoutParams();
            //int maxSize = DensityUtil.dip2px(listView.getContext(), 400);
            if (totalHeight > maxHeight && maxHeight !=0) {
                totalHeight = maxHeight;
            }
            params.height = totalHeight + (listView.getDividerHeight() * (mAdapter.getCount() - 1));
            listView.setLayoutParams(params);
            return params.height;
        }

        //listView.requestLayout();
    }
}
