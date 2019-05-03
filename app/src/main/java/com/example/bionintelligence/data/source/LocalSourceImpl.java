package com.example.bionintelligence.data.source;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.ref.WeakReference;

public class LocalSourceImpl implements LocalSource {
    private static final String APP_SETTINGS = "app_settings";
    private static final String DATABASE_FULL = "database_full";
    private static final String CULTURE_ID = "culture_id";
    private static final String CULTURE_NAME = "culture_name";
    private static final String CULTURE_PRODUCTIVE = "culture_productive";
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

    @Override
    public int getSettingsCultureId() {
        return sharedPreferences.getInt(CULTURE_ID, 1);
    }

    @Override
    public void setSettingsCultureId(int cultureId) {
        sharedPreferences.edit().putInt(CULTURE_ID, cultureId).apply();
    }

    @Override
    public String getSettingsCultureName() {
        return sharedPreferences.getString(CULTURE_NAME, "Озимая пшеница");
    }

    @Override
    public void setSettingsCultureName(String cultureName) {
        sharedPreferences.edit().putString(CULTURE_NAME, cultureName).apply();
    }

    @Override
    public int getSettingsCultureProductive() {
        return sharedPreferences.getInt(CULTURE_PRODUCTIVE, 70);
    }

    @Override
    public void setSettingsCultureProductive(int culture_productive) {
        sharedPreferences.edit().putInt(CULTURE_PRODUCTIVE, culture_productive).apply();
    }
}
