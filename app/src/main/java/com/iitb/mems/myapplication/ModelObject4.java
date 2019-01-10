package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject4 {


    Page35(R.string.page35, R.layout.page35),
    Page36(R.string.page36, R.layout.page36),
    Page37(R.string.page37, R.layout.page37);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject4(int titleResId, int layoutResId) {
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