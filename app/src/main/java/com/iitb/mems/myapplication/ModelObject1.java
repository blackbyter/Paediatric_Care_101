package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject1 {

    Page11(R.string.page11, R.layout.page11),
    Pagec(R.string.pagec, R.layout.pagec),
    Paged(R.string.paged, R.layout.paged),
    Page12(R.string.page12, R.layout.page12),
    Page13(R.string.page13, R.layout.page13),
    Page14(R.string.page14, R.layout.page14),
    Page15(R.string.page15, R.layout.page15),
    Page16(R.string.page16, R.layout.page16);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject1(int titleResId, int layoutResId) {
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