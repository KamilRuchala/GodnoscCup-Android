package com.rudymiszcz.mainActivity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.transition.Visibility;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.ImageView;

import com.example.godnosccup.*;

public class ListFragment extends Fragment {
	
	private ListFragmentActivityListener parentContext;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		final View view = inflater.inflate(R.layout.list_fragment, container, false);
		
		ImageView cup_image = (ImageView) view.findViewById(R.id.cup_image);
		
		cup_image.setVisibility(
				(getResources().getBoolean(R.bool.twoPaneMode)
							) ? View.GONE : View.VISIBLE);
		
		Button firstBtn = (Button) view.findViewById(R.id.button1);
		Button secondBtn = (Button) view.findViewById(R.id.button2);
		
		Listeners listeners = new Listeners();
		
		Listeners.ListElementListener btnListener = listeners.new ListElementListener();
		
		btnListener.setListener(parentContext);
		
		firstBtn.setOnClickListener(btnListener);
		secondBtn.setOnClickListener(btnListener);
				
		return view;
	}
	
	@Override
	public void onAttach(Activity activity) {
		
		super.onAttach(activity);
		
		if (activity instanceof ListFragmentActivityListener) {
			parentContext = (ListFragmentActivityListener) activity;
        } 
		else {
            throw new ClassCastException( activity.toString() + " musi implementowa� interfejs: " +
                "OverviewFragment.OverviewFragmentActivityListener");
        }
	}
}
