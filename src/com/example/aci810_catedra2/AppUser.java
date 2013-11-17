package com.example.aci810_catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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
		
		TextView user1 = (TextView)findViewById(R.id.userA);
		user1.setText(user);
		TextView email1 = (TextView)findViewById(R.id.emailView);
		email1.setText(email);
		TextView edad1 = (TextView)findViewById(R.id.edadView);
		edad1.setText(edad);
		EditText pass1 = (EditText)findViewById(R.id.password12);
		pass1.setText(pass);
		EditText pais1 = (EditText)findViewById(R.id.camPais);
		pais1.setText(pais);
		RadioButton sexF1 = (RadioButton)findViewById(R.id.radio0);
		sexF1.setChecked(sexF);
		RadioButton sexM1 = (RadioButton)findViewById(R.id.radio1);
		sexM1.setChecked(sexM);
		RadioButton sexO1 = (RadioButton)findViewById(R.id.radio2);
		sexO1.setChecked(sexO);
	
		setupActionBar();
		
	}

	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_user, menu);
		return true;
	}

}
