package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject3 {

    Page22(R.string.page22, R.layout.page22),
    Page23(R.string.page23, R.layout.page23),
    Page24(R.string.page24, R.layout.page24),
    Pagee(R.string.pagee, R.layout.pagee),
    Pageh(R.string.pageh, R.layout.pageh),
    Pagei(R.string.pagei, R.layout.pagei),
    Page25(R.string.page25, R.layout.page25),
    Page25a(R.string.page25a, R.layout.page25a),
    Page26(R.string.page26, R.layout.page26),
    Page27(R.string.page27, R.layout.page27),
    Page28(R.string.page28, R.layout.page28),
    Page28a(R.string.page28a, R.layout.page28a),
    Page29(R.string.page29, R.layout.page29),
    Pagej(R.string.pagej, R.layout.pagej),
    Page30(R.string.page30, R.layout.page30),
    Page31(R.string.page31, R.layout.page31),
    Page32(R.string.page32, R.layout.page32),
   // Page33(R.string.page33, R.layout.page33),
    Page34(R.string.page34, R.layout.page34);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject3(int titleResId, int layoutResId) {
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