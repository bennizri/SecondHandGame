package com.example.SecondHandGame;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    static private Context context;
//    public static Context getMyContext(){
//        return context;
//    }
    public static Context getAppContext() {
        return MyApplication.context;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
