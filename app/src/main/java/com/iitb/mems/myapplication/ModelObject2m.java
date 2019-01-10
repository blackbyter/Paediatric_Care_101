package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject2m {

    Page17m(R.string.page17m, R.layout.page17m),
    Page18m(R.string.page18m, R.layout.page18m),
    Page19m(R.string.page19m, R.layout.page19m),
    Page20m(R.string.page20m, R.layout.page20m),
    Page21m(R.string.page21m, R.layout.page21m);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject2m(int titleResId, int layoutResId) {
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