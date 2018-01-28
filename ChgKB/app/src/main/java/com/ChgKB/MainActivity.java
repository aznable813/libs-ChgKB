package com.ChgKB;

import android.app.*;
import android.os.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.provider.*;

public class MainActivity extends Activity 
{
	//del private Activity thisActiv = this;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_MAIN);

		//Creating Component 
		ComponentName com = new ComponentName("com.android.settings", "com.android.settings.LanguageSettings");

		intent.setComponent(com);
		startActivity(intent);
		

		/* del
		
		//Set Listener on Btn
		findViewById(R.id.mainButton).setOnClickListener(new OnClickListener(){
			public void onClick(View btn_v){
				Open_Input_Settings op_inten = new Open_Input_Settings(thisActiv);
				op_inten.OpenIntent();
			}
		});
		del */
    }
	
}
