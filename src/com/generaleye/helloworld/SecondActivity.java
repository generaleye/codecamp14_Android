package com.generaleye.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Intent i = getIntent();
//		boolean state = i.getBooleanExtra("PositiveBooleanValue", true);
//		Integer integer = i.getIntExtra("IntegerValue", 30);
		String string = i.getStringExtra("StringValue");
		
//		Toast.makeText(getApplicationContext(), "boolean value "+":"+state, Toast.LENGTH_SHORT).show();
//		Toast.makeText(getApplicationContext(), "integer value "+":"+integer, Toast.LENGTH_SHORT).show();
//		Toast.makeText(getApplicationContext(), "string value "+":"+string, Toast.LENGTH_SHORT).show();
		TextView textView = new TextView(this);
	    textView.setTextSize(60);
	    textView.setText(string);
	    textView.setAllCaps(true);
	    
	    
	    // Set the text view as the activity layout
	    setContentView(textView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
