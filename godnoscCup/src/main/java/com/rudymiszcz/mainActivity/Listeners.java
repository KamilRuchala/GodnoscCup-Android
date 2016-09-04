package com.rudymiszcz.mainActivity;

import com.example.godnosccup.R;

import android.view.View;

public class Listeners {

	public class ListElementListener implements View.OnClickListener{
		
		private ListFragmentActivityListener listener;

		@Override
		public void onClick(View v) {
			
			switch(v.getId()){
			
			case R.id.button1:
				listener.onSelectedItem("JEDEN");
				break;
			case R.id.button2:
				listener.onSelectedItem("DWA");
				break;
			}			
			
		}
		
		public void setListener(ListFragmentActivityListener _listener)
		{
			this.listener = _listener;
		}
		
	}
}
