package com.example.aci810_catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	SharedPreferences shadPref = getSharedPreferences("prefLog",Context.MODE_PRIVATE);
	Boolean isResgistred = shadPref.getBoolean("is-Registred",true) ;
	public final static String EMAIL = "com.example.aci810_catedra2.EMAIL";
	public final static String PASSWORD = "com.example.aci810_catedra2.PASSWORD";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void onLogin(View view){
		Intent intent = new Intent(this,AppActivity.class);
		
		EditText email1 = (EditText)findViewById(R.id.emailField);
		String emailIngresado = email1.getText().toString(); 
		EditText pass1 = (EditText)findViewById(R.id.password12);
		String passIngresada= pass1.getText().toString();
		String email = shadPref.getString(EMAIL,"");
		String pass  = shadPref.getString(PASSWORD, "");
		
		
		
		if(emailIngresado == email && passIngresada ==pass){
			//muestre pantalla principal de la aplicacio
			 Toast.makeText(LoginActivity.this, "Login Successful",Toast.LENGTH_LONG).show();
        } else{
        	//muestre error en pantalla 
         Toast.makeText(LoginActivity.this, "Invalid Login",Toast.LENGTH_LONG).show();
        }
		startActivity(intent);
	}

}
