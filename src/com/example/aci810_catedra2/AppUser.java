package com.example.aci810_catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AppUser extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_user);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_user, menu);
		return true;
	}

}
