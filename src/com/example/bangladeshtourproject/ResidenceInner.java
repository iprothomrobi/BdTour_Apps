package com.example.bangladeshtourproject;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class ResidenceInner extends Activity{
       Button A,B,C,D;
       protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.coxes_hotel_details);
			
			A=(Button)findViewById(R.id.HotelA);
			B=(Button)findViewById(R.id.HotelB);
			C=(Button)findViewById(R.id.HotelC);
			D=(Button)findViewById(R.id.HotelD);
		A.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Intent i=new Intent(ResidenceInner.this,HotelA.class);
					startActivity(i);
					}
				});
					B.setOnClickListener(new OnClickListener(){

						@Override
						public void onClick(View v) {
							Intent i=new Intent(ResidenceInner.this,HotelB.class);
							startActivity(i);
						}
					});
		C.setOnClickListener(new OnClickListener(){

								@Override
								public void onClick(View v) {
									Intent i=new Intent(ResidenceInner.this,HotelC.class);
									startActivity(i);
								}
		});
		D.setOnClickListener(new OnClickListener(){

										@Override
										public void onClick(View v) {
											Intent i=new Intent(ResidenceInner.this,HotelD.class);
											startActivity(i);
										}
		});
															}
		
			}
		
											