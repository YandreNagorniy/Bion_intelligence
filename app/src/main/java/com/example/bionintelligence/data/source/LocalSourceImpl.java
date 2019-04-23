package com.example.bionintelligence.data.source;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.ref.WeakReference;

public class LocalSourceImpl implements LocalSource {
    private static final String APP_SETTINGS = "app_settings";
    private static final String DATABASE_FULL = "database_full";
    private SharedPreferences sharedPreferences;

    public LocalSourceImpl(WeakReference<Context> context) {
        sharedPreferences = context.get().getApplicationContext().getSharedPreferences(APP_SETTINGS, Context.MODE_PRIVATE);
    }

    @Override
    public boolean getLocalData() {
        return sharedPreferences.getBoolean(DATABASE_FULL, false);
    }

    @Override
    public void setLocalData(boolean isFull) {
        sharedPreferences.edit().putBoolean(DATABASE_FULL, isFull).apply();
    }
}
