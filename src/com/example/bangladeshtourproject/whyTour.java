package com.example.bangladeshtourproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class whyTour extends Activity {
	Button History,Culture,Literature,Music,FoodFruits,Dress,SeasonClimates,HolidayFesTivals,Currency;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.why_tour_bd);
		History=(Button) findViewById(R.id.History);
		Culture=(Button) findViewById(R.id.Culture);
		Literature=(Button) findViewById(R.id.Literature);
		Music=(Button) findViewById(R.id.Music);
		FoodFruits=(Button) findViewById(R.id.FoodandFruits);
		Dress=(Button) findViewById(R.id.Dress);
		SeasonClimates=(Button) findViewById(R.id.SeasonandClimate);
		HolidayFesTivals=(Button) findViewById(R.id.Holiday);
		Currency=(Button) findViewById(R.id.Currency);
		History.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent i=new Intent(whyTour.this,History.class);
				startActivity(i);
				}
			});
				Culture.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View v) {
						Intent i=new Intent(whyTour.this,Culture.class);
						startActivity(i);
					}
				});
	Literature.setOnClickListener(new OnClickListener(){

							@Override
							public void onClick(View v) {
								Intent i=new Intent(whyTour.this,Literature.class);
								startActivity(i);
							}
	});
	Music.setOnClickListener(new OnClickListener(){

									@Override
									public void onClick(View v) {
										Intent i=new Intent(whyTour.this,Music.class);
										startActivity(i);
									}
	});
	FoodFruits.setOnClickListener(new OnClickListener(){

											@Override
				public void onClick(View v) {
			Intent i=new Intent(whyTour.this,FoodsFruits.class);
					startActivity(i);
											}
										});
	Dress.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View v) {
			Intent i=new Intent(whyTour.this,Dress.class);
			startActivity(i);
			}
		});
			SeasonClimates.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Intent i=new Intent(whyTour.this,SeasonClimate.class);
					startActivity(i);
				}
			});
HolidayFesTivals.setOnClickListener(new OnClickListener(){

						@Override
						public void onClick(View v) {
							Intent i=new Intent(whyTour.this,HolidayFesTivals.class);
							startActivity(i);
						}
});
Currency.setOnClickListener(new OnClickListener(){

								@Override
								public void onClick(View v) {
									Intent i=new Intent(whyTour.this,Currency.class);
									startActivity(i);
	}
});
}
}


