package com.geofence.drivergeofence;

import com.google.android.gms.fitness.data.Application;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParsePush;

/**
 * Created by dell-15 on 06-Dec-15.
 */
public class ParseApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "wuKOMiIyw9mo579ITKCuAR5lz5OoiIG1m5K9krEG", "BmQtKZdNaFr2Mn3Hi4cgFs1JOXLA3JYcB1KKEv8y");
        ParseInstallation.getCurrentInstallation().saveInBackground();
        ParsePush.subscribeInBackground("arpit");


    }
}
