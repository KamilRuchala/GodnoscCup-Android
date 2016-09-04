package com.rudymiszcz.mainActivity;

import com.example.godnosccup.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
	
	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.detail_fragment, container, false);
		
		if(!getResources().getBoolean(R.bool.twoPaneMode))
		{
			setText(this.getArguments().getString("txt"));
		}
		
		return view;
	}
	
	public void setText(String txt){
		
		TextView txtView = (TextView) view.findViewById(R.id.detailsText);
		
		txtView.setText(txt);
	}
}
