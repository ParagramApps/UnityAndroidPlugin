package com.example.unity;

import android.util.Log;

public class MyPlugin {
    private static final MyPlugin ourInstance = new MyPlugin();

    private static final String LOGTAG = "AltGras";

    public static MyPlugin getInstance() { return ourInstance; }

    public float surfaceArea = 10.0f;
    private long startTime;
    private MyPlugin() {
        Log.i(LOGTAG, "Created MyPlugin");
        startTime = System.currentTimeMillis();
    }

    public double getElapsedTime()
    {
        return (System.currentTimeMillis()-startTime)/1000.0f;
    }

    public void printText(String s)
    {
        System.out.println("Text from Unity: "+s);
    }
}
