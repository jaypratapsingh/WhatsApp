var whatsapp = {
    openapp: function(successCallback, errorCallback, message) {
		cordova.exec(function(success) {
					console.log(success);
				},
				function(error) {
					console.log(error);
					if(error.indexOf("No Activity")>0){
						console.log("WhatsApp is not found in your device");
					}
				},
				"WhatsApp",
				"WhatsApp_method_called",
		message);
    }
}

module.exports = whatsapp;

