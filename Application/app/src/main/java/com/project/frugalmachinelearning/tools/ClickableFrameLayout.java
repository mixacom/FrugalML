package com.project.frugalmachinelearning.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Mikhail on 08.06.2016.
 */

public class ClickableFrameLayout extends FrameLayout {
    private OnClickListener mOnClickListener;

    @Override
    public void setOnClickListener(View.OnClickListener l) {
        super.setOnClickListener(l);
        mOnClickListener = l;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return mOnClickListener != null;
    }


    // Standard constructors — just pass everything
    public ClickableFrameLayout(final Context context) {
        super(context);
    }

    public ClickableFrameLayout(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public ClickableFrameLayout(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ClickableFrameLayout(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



}