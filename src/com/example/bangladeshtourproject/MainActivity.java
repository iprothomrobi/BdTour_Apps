package com.example.bangladeshtourproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button why_tour,tourist_spot,about_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        why_tour=(Button) findViewById(R.id.Whytour);
        tourist_spot=(Button) findViewById(R.id.Touristspots);
        about_me=(Button) findViewById(R.id.Aboutme);
        why_tour.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i= new Intent(MainActivity.this,whyTour.class);
				startActivity(i);
				// TODO Auto-generated method stub
				
			}
		});
 about_me.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i= new Intent(MainActivity.this,aboutMe.class);
				startActivity(i);
				// TODO Auto-generated method stub
				
			}
		});
 tourist_spot.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i= new Intent(MainActivity.this,TouristSpot.class);
			startActivity(i);
			// TODO Auto-generated method stub
			
		}
	});
    }


   
    }
    

