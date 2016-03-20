package com.example.bangladeshtourproject;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class TouristSpot extends Activity {
	Button CoxesBazar,SentMartin,Sundarbon,Bandarban,Rangamati,Paharpur,Sompur,Mainamati,Sylhet,ComillaCoatbari,Sonargoan,KantazirTemple,NatoreRajbari,Kuakata,SitaKunda,KustiasilayDaha,KhagraChori,NijumDip;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tourist_spot_in_bangladesh);
		CoxesBazar=(Button) findViewById(R.id.CoxzBazar);
		SentMartin=(Button) findViewById(R.id.SentMartin);
		Sundarbon=(Button) findViewById(R.id.Sundarban);
		Bandarban=(Button) findViewById(R.id.Bandarban);
		Rangamati=(Button) findViewById(R.id.Rangamati);
		Paharpur=(Button) findViewById(R.id.Paharpur);
		Sompur=(Button) findViewById(R.id.Sompur);
		Mainamati=(Button) findViewById(R.id.Mainamoti);
		Sylhet=(Button) findViewById(R.id.SylhetZaflong);
		ComillaCoatbari=(Button) findViewById(R.id.ComillaCoatBari);
		Sonargoan=(Button) findViewById(R.id.Sonargoan);
	KantazirTemple=(Button) findViewById(R.id.KantaZir);
		KhagraChori=(Button) findViewById(R.id.KhagRachari);
		Kuakata=(Button) findViewById(R.id.Kuakata);
		SitaKunda=(Button) findViewById(R.id.Sitakundo);
		KustiasilayDaha=(Button) findViewById(R.id.Kustia);
		NijumDip=(Button) findViewById(R.id.nijumdip);
		CoxesBazar.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,CoxesInner.class);
				startActivity(text);
				
			}});
		SentMartin.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,SentMartinInner.class);
				startActivity(text);
				
			}});
		Sundarbon.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,Sundarban.class);
				startActivity(text);
				
			}});
		Bandarban.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,Bandarban.class);
				startActivity(text);
				
			}});
		Rangamati.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,Rangamati.class);
				startActivity(text);
				
			}});
		Paharpur.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,PaharpurInner.class);
				startActivity(text);
				
			}});
		Sompur.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,Sompur.class);
				startActivity(text);
				
			}});
		Mainamati.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,MainamatiInner.class);
				startActivity(text);
				
			}});
		Sylhet.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,Sylhet.class);
				startActivity(text);
				
			}});
		ComillaCoatbari.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,ComillaCoatbari.class);
				startActivity(text);
				
			}});
		Sonargoan.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,Sonargoan.class);
				startActivity(text);
				
			}});
		KantazirTemple.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,KantazirTemple.class);
				startActivity(text);
				
			}});
		KhagraChori.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,KhagraChori.class);
				startActivity(text);
				
			}});
		SitaKunda.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,SitaKundaInner.class);
				startActivity(text);
				
			}});
		KustiasilayDaha.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,KustiasilayDahaInner.class);
				startActivity(text);
				
			}});
		NijumDip.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent text=new Intent(TouristSpot.this,NijuDip.class);
				startActivity(text);
				
			}});
	}
}