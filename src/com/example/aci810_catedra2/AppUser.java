package com.example.aci810_catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;

public class AppUser extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_user);
		
		SharedPreferences shadPref = getSharedPreferences("prefLog",Context.MODE_PRIVATE);
		String email = shadPref.getString(MainActivity.EMAIL, "not set");
		String edad = shadPref.getString(MainActivity.EDAD, "not set");
		String user = shadPref.getString(MainActivity.USER, "not set");
		String pass = shadPref.getString(MainActivity.PASSWORD, "not set");
		String pais = shadPref.getString(MainActivity.PAIS, "not set");
		Boolean sexF = shadPref.getBoolean(MainActivity.FEMENINO, false);
		Boolean sexM = shadPref.getBoolean(MainActivity.MASCULINO,false);
		Boolean sexO = shadPref.getBoolean(MainActivity.OTRO,false);
	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_user, menu);
		return true;
	}

}
