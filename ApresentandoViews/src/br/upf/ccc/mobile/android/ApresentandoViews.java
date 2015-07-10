package br.upf.ccc.mobile.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ApresentandoViews extends Activity {
	TextView tv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        
        Button btn = new Button(this);
        btn.setText("Ola Mundo");
        btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				tv.setText("Você clicou no botão...");
				
			}
		});
        ll.addView(btn);
        
        tv = new TextView(this);
        tv.setText("Texto estático");
        ll.addView(tv);
        
        EditText et = new EditText(this);
        et.setText("");
        ll.addView(et);
        
        setContentView(ll);
    }
}
