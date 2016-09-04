package com.example.godnosccup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenuActivity extends Activity {
	
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		context = this;
		
		TextView txtTitle = (TextView) findViewById(R.id.title);
		Typeface tf = Typeface.createFromAsset(this.getAssets(),
	            "fonts/font.ttf");		
		txtTitle.setTypeface(tf);
		
		ImageView tournamentButton = (ImageView) findViewById(R.id.tournamentImage);
		
		tournamentButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				 Intent intent = new Intent(context, MainActivity.class);
				 startActivity(intent);
			}
		});
		
		ImageView configButton = (ImageView) findViewById(R.id.configurationImage);
		
		configButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				 Intent intent = new Intent(context, ConfigActivity.class);
				 startActivity(intent);
			}
		});
	}
}
