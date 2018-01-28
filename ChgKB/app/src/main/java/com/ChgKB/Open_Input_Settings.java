package com.ChgKB;
import android.app.*;
import android.content.*;
import android.provider.*;

public class Open_Input_Settings
{
	private Activity ThisAct;
	
	//Const
	public Open_Input_Settings(Activity activ){
		ThisAct = activ;
	}
	
	public void OpenIntent(){
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_MAIN);
		
		//Creating Component 
		ComponentName com = new ComponentName("com.android.settings", "com.android.settings.LanguageSettings");
		
		intent.setComponent(com);
		ThisAct.startActivity(intent);
		
	}
}
