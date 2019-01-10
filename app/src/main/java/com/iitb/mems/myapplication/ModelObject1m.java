package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject1m {

    Page11m(R.string.page11m, R.layout.page11m),
    Pagecm(R.string.pagecm, R.layout.pagecm),
    Pagedm(R.string.pagedm, R.layout.pagedm),
    Page12m(R.string.page12m, R.layout.page12m),
    Page13m(R.string.page13m, R.layout.page13m),
    Page14m(R.string.page14m, R.layout.page14m),
    Page15m(R.string.page15m, R.layout.page15m),
    Page16m(R.string.page16m, R.layout.page16m);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject1m(int titleResId, int layoutResId) {
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