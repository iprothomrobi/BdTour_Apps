package com.example.bangladeshtourproject;



import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CoxesInner extends Activity{
	Button Details,Scenery,Spot,Residence,Communication;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.coxesbazar_details);
		Details=(Button) findViewById(R.id.Details);
		Scenery=(Button) findViewById(R.id.Scenery);
		Spot=(Button) findViewById(R.id.Spot);
		Residence=(Button) findViewById(R.id.Residence);
		Communication=(Button) findViewById(R.id.Communication);
		Details.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent i=new Intent(CoxesInner.this,DetailsInner.class);
				startActivity(i);
				
			}});
		Scenery.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent i=new Intent(CoxesInner.this,SceneryInner.class);
				startActivity(i);
				
			}});
		Spot.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent i=new Intent(CoxesInner.this,SpotInner.class);
				startActivity(i);
				
			}});
	    Residence.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent i=new Intent(CoxesInner.this,ResidenceInner.class);
				startActivity(i);
				
			}});
		Communication.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent i=new Intent(CoxesInner.this,CommunicationInner.class);
				startActivity(i);
				
			}});
	}
	

}
