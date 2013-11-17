package com.example.aci810_catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	EditText userName;
	EditText pass;
	Button login;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		 userName = (EditText)findViewById(R.id.emailField);
		 pass = (EditText)findViewById(R.id.password12);
		 login = (Button)findViewById(R.id.login);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void onLogin(View view){
		Intent intent = new Intent(this,AppActivity.class);
		if((userName.getText().toString()).equals(pass.getText().toString())){
			 Toast.makeText(LoginActivity.this, "Login Successful",Toast.LENGTH_LONG).show();
        } else{
         Toast.makeText(LoginActivity.this, "Invalid Login",Toast.LENGTH_LONG).show();
        }
		startActivity(intent);
	}

}
