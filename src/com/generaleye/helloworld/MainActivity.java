package com.generaleye.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	EditText texBox1;
	EditText texBox2;
	EditText texBox3;
	EditText texBox4;
	EditText texBox5;
	Button b;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView view = (TextView)this.findViewById(R.id.textView1);
//        view.setText("Codecamp 2014 Test Android Class");
        b = (Button)this.findViewById(R.id.button1);
        texBox1 = (EditText)this.findViewById(R.id.editText1);
        texBox2 = (EditText)this.findViewById(R.id.editText2);
        texBox3 = (EditText)this.findViewById(R.id.editText3);
        texBox4 = (EditText)this.findViewById(R.id.editText4);
        texBox5 = (EditText)this.findViewById(R.id.editText5);
        
        b.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		Intent i = new Intent(MainActivity.this, SecondActivity.class);
        		String value1 = texBox1.getText().toString();
        		String value2 = texBox2.getText().toString();
        		String value3 = texBox3.getText().toString();
        		String value4 = texBox4.getText().toString();
        		String value5 = texBox5.getText().toString();
        		i.putExtra("StringValue1", value1);
        		i.putExtra("StringValue2", value2);
        		i.putExtra("StringValue3", value3);
        		i.putExtra("StringValue4", value4);
        		i.putExtra("StringValue5", value5);
        		startActivity(i);
        		
        	}
        });
    }

//	@Override
//	protected void onStart() {
//		super.onStart();
		
//		Intent i = new Intent(MainActivity.this, SecondActivity.class);
//		i.putExtra("PositiveBooleanValue", true);
//		i.putExtra("IntegerValue", 30);
//		i.putExtra("StringValue", "Codecamp");
//		
//		startActivity(i);
//	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
        	Toast.makeText(getApplicationContext(), "Yes ooo", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
