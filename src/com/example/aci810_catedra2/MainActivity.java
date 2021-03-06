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

public class MainActivity extends Activity {
	
	
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
		setContentView(R.layout.activity_main);
		SharedPreferences shadPref = getSharedPreferences("prefLog",Context.MODE_PRIVATE);
		Boolean isResgistred = shadPref.getBoolean("is-Registred",false) ;	
		if(isResgistred){
			setContentView(R.layout.activity_login);//ir a login	
			
		}
		else{
			setContentView(R.layout.activity_main);//ir a register
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClickRegister(View view){
		Intent intent = new Intent(this,AppActivity.class);
		
		EditText email = (EditText)findViewById(R.id.emailField); 
		String email1 = email.getText().toString(); 
		EditText user = (EditText)findViewById(R.id.editText1);
		String user1 = user.getText().toString();
		EditText password = (EditText)findViewById(R.id.password12);
		String pass = password.getText().toString();
		EditText edad23 = (EditText)findViewById(R.id.editText2);
		String edad1 = edad23.getText().toString();
		EditText pais = (EditText)findViewById(R.id.Pais);
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
