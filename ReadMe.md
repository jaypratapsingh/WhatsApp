*************Cordova : WhatsApp*****************

By using this plugin you can share message on whatsapp


Install this plugin using:

cordova plugin add com.jp.plugin.whatsapp



Remove Plugins :

cordova plugin remove com.jp.plugin.whatsapp



Put the below code in your javascript code to share message on whatsapp: 

whatsapp.openapp(
	function(success)
	{
            console.log(success);
        }, 
	function(error)
	{
            console.log(error);
        },
	message
    );


GitHub URL:   https://github.com/jaypratapsingh/WhatsApp

npm url :     https://www.npmjs.com/package/com.jp.plugin.whatsapp