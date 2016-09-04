package com.example.godnosccup;

import com.rudymiszcz.mainActivity.DetailFragment;
import com.rudymiszcz.mainActivity.ListFragment;
import com.rudymiszcz.mainActivity.ListFragmentActivityListener;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends Activity implements ListFragmentActivityListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		if (findViewById(R.id.fragment_container) != null) {
	
			if(getResources().getBoolean(R.bool.twoPaneMode))
			{
				return;
			}
			if (savedInstanceState != null) {
				 
				getFragmentManager().executePendingTransactions();
	            Fragment fragmentById = getFragmentManager().
	                    findFragmentById(R.id.fragment_container);
	            if (fragmentById!=null) {
	                getFragmentManager().beginTransaction()
	                        			.remove(fragmentById).commit();
	            }            
			}
			
			ListFragment listFragment = new ListFragment();
	        
			getFragmentManager().beginTransaction()
										.replace(R.id.fragment_container, listFragment)
										.commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onSelectedItem(String txt) {
		
		if(getResources().getBoolean(R.bool.twoPaneMode))
		{
			DetailFragment detFrag = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
			
			detFrag.setText(txt);
		}
		else
		{
			DetailFragment detFrag = new DetailFragment();
			Bundle bundle = new Bundle();
			
			bundle.putString("txt", txt);
			detFrag.setArguments(bundle);
			
			getFragmentManager().beginTransaction()
										.replace(R.id.fragment_container, detFrag)
										.addToBackStack(null)
										.commit();
		}
			
	}
}
