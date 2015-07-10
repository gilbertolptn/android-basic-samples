package br.upf.ccc.mobile.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class CicloVida extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.i("Cliclo de Vida", "onCreate");
    }

	@Override
	public CharSequence onCreateDescription() {
		// TODO Auto-generated method stub
		
		Log.i("Cliclo de Vida", "onCreateDescription");
		
		return super.onCreateDescription();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
		Log.i("Cliclo de Vida", "onDestroy");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		Log.i("Cliclo de Vida", "onPause");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		
		Log.i("Cliclo de Vida", "onRestart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		Log.i("Cliclo de Vida", "onResume");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		Log.i("Cliclo de Vida", "onStart");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		Log.i("Cliclo de Vida", "onStop");
	}
}