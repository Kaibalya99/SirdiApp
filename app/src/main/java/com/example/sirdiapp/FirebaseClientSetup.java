package com.example.sirdiapp;

import android.app.Application;

import com.firebase.client.Firebase;

public class FirebaseClientSetup extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
