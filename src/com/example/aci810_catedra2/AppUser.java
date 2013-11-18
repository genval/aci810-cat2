package com.example.aci810_catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AppUser extends Activity {
	
	public final static String RADIO_GROUP = "com.example.aci810_catedra2.RADIO_GROUP";
	public final static String EMAIL = "com.example.aci810_catedra2.EMAIL";
	public final static String PAIS = "com.example.aci810_catedra2.PAIS";
	public final static String EDAD = "com.example.aci810_catedra2.EDAD";
	public final static String USER = "com.example.aci810_catedra2.USER";
	public final static String PASSWORD = "com.example.aci810_catedra2.PASSWORD";
	public final static String FEMENINO = "com.example.aci810_catedra2.FEMENINO";
	public final static String MASCULINO = "com.example.aci810_catedra2.MASCULINO";
	public final static String OTRO = "com.example.aci810_catedra2.OTRO";

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

	public void onGuardar(View view){
		Intent intent = new Intent(this,AppActivity.class);
		EditText email = (EditText)findViewById(R.id.emailView); 
		String email1 = email.getText().toString(); 
		EditText user = (EditText)findViewById(R.id.userA);
		String user1 = user.getText().toString();
		EditText password = (EditText)findViewById(R.id.password12);
		String pass = password.getText().toString();
		EditText edad23 = (EditText)findViewById(R.id.editText2);
		String edad1 = edad23.getText().toString();
		EditText pais = (EditText)findViewById(R.id.camPais);
		String pais1 = pais.getText().toString();
		RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
		int rg1 = rg.getCheckedRadioButtonId();
		RadioButton radBut1 = (RadioButton)findViewById(R.id.radio0);
		Boolean rb0= radBut1.isChecked();
		RadioButton radBut2 = (RadioButton)findViewById(R.id.radio1);
		Boolean rb1 = radBut2.isChecked();
		RadioButton radBut3 = (RadioButton)findViewById(R.id.radio2);
		Boolean rb2 = radBut3.isChecked();

		SharedPreferences shadPref = getSharedPreferences("prefLog",Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = shadPref.edit();
		
		editor.putString(EMAIL,email1);
		editor.putString(USER, user1);
		editor.putString(PASSWORD, pass);
		editor.putString(EDAD, edad1);
		editor.putString(PAIS, pais1);
		editor.putInt(RADIO_GROUP, rg1);
		editor.putBoolean(FEMENINO, rb0);
		editor.putBoolean(MASCULINO, rb1);
		editor.putBoolean(OTRO, rb2);
		editor.commit();
		startActivity(intent);		
		
		
	}

}
