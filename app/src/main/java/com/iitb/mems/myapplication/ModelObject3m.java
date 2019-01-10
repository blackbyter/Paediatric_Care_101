package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

public enum ModelObject3m {

    Page22m(R.string.page22m, R.layout.page22m),
    Page23m(R.string.page23m, R.layout.page23m),
    Page24m(R.string.page24m, R.layout.page24m),
    Pageem(R.string.pageem, R.layout.pageem),
    Pagehm(R.string.pagehm, R.layout.pagehm),
    Pageim(R.string.pageim, R.layout.pageim),
    Page25m(R.string.page25m, R.layout.page25m),
    Page26m(R.string.page26m, R.layout.page26m),
    Page27m(R.string.page27m, R.layout.page27m),
   // Page28m(R.string.page28m, R.layout.page28m),
    Page29m(R.string.page29m, R.layout.page29m),
    Pagejm(R.string.pagejm, R.layout.pagejm),
   /* Page30m(R.string.page30m, R.layout.page30m),
    Page31m(R.string.page31m, R.layout.page31m),
    Page32m(R.string.page32m, R.layout.page32m),
    Page33m(R.string.page33m, R.layout.page33m),*/
    Page34m(R.string.page34m, R.layout.page34m);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject3m(int titleResId, int layoutResId) {
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