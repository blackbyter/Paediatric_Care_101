package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObjectm {




    Page1m(R.string.page1m, R.layout.page1m),
    Page2m(R.string.page2m, R.layout.page2m),
    Page3m(R.string.page3m, R.layout.page3m),
    Page4m(R.string.page4m, R.layout.page4m),
    Page5m(R.string.page5m, R.layout.page5m),
    Pageam(R.string.pageam, R.layout.pageam),
    Pagebm(R.string.pagebm, R.layout.pagebm),
    Page6m(R.string.page6m, R.layout.page6m),
    Page7m(R.string.page7m, R.layout.page7m),
    Page8m(R.string.page8m, R.layout.page8m),
    Page9m(R.string.page9m, R.layout.page9m),
    Page9ma(R.string.page9ma, R.layout.page9ma),
    Page10m(R.string.page10m, R.layout.page10m);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObjectm(int titleResId, int layoutResId) {
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