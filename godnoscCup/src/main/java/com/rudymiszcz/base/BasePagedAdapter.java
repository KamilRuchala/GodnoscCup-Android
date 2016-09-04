package com.rudymiszcz.base;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;


public class BasePagedAdapter extends FragmentPagerAdapter {

	private int pageNumber;
	
	public BasePagedAdapter(FragmentManager fragmentManager, int pageNumeber) {
        super(fragmentManager);
        this.pageNumber = pageNumeber;
    }
	
	@Override
	public Fragment getItem(int arg0) {
		
		return null;
	}

	@Override
	public int getCount() {
		
		return pageNumber;
	}
	
	@Override
    public CharSequence getPageTitle(int position) {
    	return "Page " + position;
    }

}
