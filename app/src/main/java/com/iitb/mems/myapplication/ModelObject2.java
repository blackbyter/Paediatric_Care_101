package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject2 {

    Page17(R.string.page17, R.layout.page17),
    Page18(R.string.page18, R.layout.page18),
    Page19(R.string.page19, R.layout.page19),
    Page20(R.string.page20, R.layout.page20),
    Page21(R.string.page21, R.layout.page21);

    private int mTitleResId;
    private int mLayoutResId;


    ModelObject2(int titleResId, int layoutResId) {
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