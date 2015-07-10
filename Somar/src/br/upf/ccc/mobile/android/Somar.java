package br.upf.ccc.mobile.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Somar extends Activity {
	Button btnSomar;
	EditText etUm,etDois,etResultado;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        
        etUm = new EditText(this);
        etUm.setText("");
        ll.addView(etUm);
        
        etDois = new EditText(this);
        etDois.setText("");
        ll.addView(etDois);
        
        btnSomar = new Button(this);
        btnSomar.setText("Somar");
        btnSomar.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				float vlr1,vlr2,resultado;
				vlr1 = Float.parseFloat(etUm.getText().toString());
				vlr2 = Float.parseFloat(etDois.getText().toString());
				resultado = vlr1 + vlr2;
				etResultado.setText(resultado+"");
			}
		});
        ll.addView(btnSomar);
        
        etResultado = new EditText(this);
        etResultado.setText("");
        ll.addView(etResultado);
        
        setContentView(ll);
    }
}