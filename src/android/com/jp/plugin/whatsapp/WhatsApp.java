package com.jp.plugin.whatsapp;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import android.content.Intent;
import android.util.Log;

public class WhatsApp extends CordovaPlugin {

	//Plugins created by JP on 9 Feb 2014

	@Override
	public boolean execute(String actionString, String message, CallbackContext callbackContext)
	{
		try
		{
			String getMessage=message.replace('"', ' ');

			if(actionString.equalsIgnoreCase("whatsapp_method_called")){
				Intent i=new Intent();
				i.setPackage("com.whatsapp");
				i.setType("text/plain");
				i.putExtra(Intent.EXTRA_TEXT, getMessage);
				cordova.getActivity().startActivity(i);
				callbackContext.success("success");
				return true;
			}
			else{
				callbackContext.error("Invalid Selection");
				return false;
			}
		}
		catch(Exception e){
			Log.e(null,"JP:Plugins:ExceptionError"+e);
			callbackContext.error("JP:Plugins:ExceptionError "+e.getMessage());
			return false;
		}
	}

}
