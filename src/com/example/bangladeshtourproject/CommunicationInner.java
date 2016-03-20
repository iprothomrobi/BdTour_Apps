package com.example.bangladeshtourproject;




import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class CommunicationInner extends Activity {
	Button Bus, Train, Air;
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.coxes_communication_details);
	        Bus=(Button) findViewById(R.id.Bus);
	        Train=(Button) findViewById(R.id.Train);
	        Air=(Button) findViewById(R.id.Air);
	        Bus.setOnClickListener(new OnClickListener(){

	        	@Override
	        	public void onClick(View v) {
	        		
	        		Intent i=new Intent(CommunicationInner.this,Bus.class);
	        		startActivity(i);
	        		
	        	}});
	        Train.setOnClickListener(new OnClickListener(){

	        	@Override
	        	public void onClick(View v) {
	        		
	        		Intent i=new Intent(CommunicationInner.this,Train.class);
	        		startActivity(i);
	        		
	        	}});
	        Air.setOnClickListener(new OnClickListener(){

	        	@Override
	        	public void onClick(View v) {
	        		
	        		Intent i=new Intent(CommunicationInner.this,Air.class);
	        		startActivity(i);
	        		
	        	}});



	 }

}
