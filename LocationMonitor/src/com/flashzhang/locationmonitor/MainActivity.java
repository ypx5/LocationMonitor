package com.flashzhang.locationmonitor;

import android.os.Bundle;
import android.provider.Settings.Secure;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView serialno=(TextView)findViewById(R.id.serialno);
		String m_szAndroidID = Secure.getString(getContentResolver(), Secure.ANDROID_ID);
		serialno.setText(m_szAndroidID);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
