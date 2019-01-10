package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomPagerAdapter3m extends PagerAdapter {

    private Context mContext;


    public CustomPagerAdapter3m(Context context) {
        mContext = context;
    }


    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelObject3m modelObject = ModelObject3m.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelObject3m.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObject3m customPagerEnum = ModelObject3m.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }
}
