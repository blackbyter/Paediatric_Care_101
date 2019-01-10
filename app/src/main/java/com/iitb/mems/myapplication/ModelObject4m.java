package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject4m {


    Page35m(R.string.page35m, R.layout.page35m),
    Page36m(R.string.page36m, R.layout.page36m),
    Page37m(R.string.page37m, R.layout.page37m);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject4m(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;

    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}