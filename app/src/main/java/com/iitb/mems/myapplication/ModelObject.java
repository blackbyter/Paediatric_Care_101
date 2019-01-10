package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject {




    Page1(R.string.page1, R.layout.page1),
    Page2(R.string.page2, R.layout.page2),
    Page3(R.string.page3, R.layout.page3),
    Page4(R.string.page4, R.layout.page4),
    Page5(R.string.page5, R.layout.page5),
    Pagea(R.string.pagea, R.layout.pagea),
    Pageb(R.string.pageb, R.layout.pageb),
    Page6(R.string.page6, R.layout.page6),
    Page7(R.string.page7, R.layout.page7),
    Page8(R.string.page8, R.layout.page8),
    Page9(R.string.page9, R.layout.page9),
    Page10(R.string.page10, R.layout.page10);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
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