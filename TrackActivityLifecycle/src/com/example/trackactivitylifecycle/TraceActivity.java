package com.example.trackactivitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TraceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Create Executed");
	}
	
	protected void onStart(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Start Executed");
	}
	
	protected void onResume(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Resume Executed");
	}
	
	protected void onRestart(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Restart Executed");
	}
	
	protected void onPause(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Pause Executed");
	}
	
	protected void onStop(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Stop Executed");
	}
	
	protected void onDestroy(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Destroy Executed");
	}
	
}