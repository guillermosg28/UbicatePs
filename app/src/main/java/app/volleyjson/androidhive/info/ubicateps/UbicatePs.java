package app.volleyjson.androidhive.info.ubicateps;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;


public class UbicatePs extends Application {

    @Override
    public void onCreate() {
        super.onCreate();



        Parse.initialize(this, "RKDT798EIyVwS4oA5xVhixVOWEtsrKsET45D8pdS", "dcBGXfFIiMuO0pF5AJSsyM4f0FD0lU8uvRQaq26u");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
