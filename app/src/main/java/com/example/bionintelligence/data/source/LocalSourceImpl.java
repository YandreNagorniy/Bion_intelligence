package com.example.bionintelligence.data.source;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.ref.WeakReference;

public class LocalSourceImpl implements LocalSource {
    private static final String APP_SETTINGS = "app_settings";
    private static final String DATABASE_FULL = "database_full";
    private static final String CULTURE_ID = "culture_id";
    private static final String CULTURE_PRODUCTIVE = "culture_productive";
    private static final String ANALYTICAL_FACTORS_N = "analytical_factors_N";
    private static final String ANALYTICAL_FACTORS_P2O5 = "analytical_factors_P2O5";
    private static final String ANALYTICAL_FACTORS_K2O = "analytical_factors_K2O";
    /*   private static final String CULTURE_NAME = "culture_name";
       private static final String PRODUCTIVE_MAX = "productive_max";
       private static final String PRODUCTIVE_MIN = "productive_min";
       private static final String PRODUCTIVE_STEP = "productive_step";*/
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

 /*   @Override
    public String getSettingsCultureName() {
        return sharedPreferences.getString(CULTURE_NAME, "Озимая пшеница");
    }

    @Override
    public void setSettingsCultureName(String cultureName) {
        sharedPreferences.edit().putString(CULTURE_NAME, cultureName).apply();
    }*/

    @Override
    public int getSettingsCultureProductive() {
        return sharedPreferences.getInt(CULTURE_PRODUCTIVE, 70);
    }

    @Override
    public void setSettingsCultureProductive(int culture_productive) {
        sharedPreferences.edit().putInt(CULTURE_PRODUCTIVE, culture_productive).apply();
    }

    @Override
    public int getAnalyticalFactorsN() {
        return sharedPreferences.getInt(ANALYTICAL_FACTORS_N, 1);
    }

    @Override
    public void setAnalyticalFactorsN(int analyticalFactors1) {
        sharedPreferences.edit().putInt(ANALYTICAL_FACTORS_N, analyticalFactors1).apply();
    }

    @Override
    public int getAnalyticalFactorsP2O5() {
        return sharedPreferences.getInt(ANALYTICAL_FACTORS_P2O5, 1);
    }

    @Override
    public void setAnalyticalFactorsP2O5(int analyticalFactors2) {
        sharedPreferences.edit().putInt(ANALYTICAL_FACTORS_P2O5, analyticalFactors2).apply();
    }

    @Override
    public int getAnalyticalFactorsK2O() {
        return sharedPreferences.getInt(ANALYTICAL_FACTORS_K2O, 1);
    }

    @Override
    public void setAnalyticalFactorsK2O(int analyticalFactors3) {
        sharedPreferences.edit().putInt(ANALYTICAL_FACTORS_K2O, analyticalFactors3).apply();
    }
//    @Override
//    public int getSettingsProductiveMax() {
//        return sharedPreferences.getInt(PRODUCTIVE_MAX, 120);
//    }
//
//    @Override
//    public void setSettingsProductiveMax(int productiveMax) {
//        sharedPreferences.edit().putInt(PRODUCTIVE_MAX, productiveMax).apply();
//    }
//
//    @Override
//    public int getSettingsProductiveMin() {
//        return sharedPreferences.getInt(PRODUCTIVE_MIN, 30);
//    }
//
//    @Override
//    public void setSettingsProductiveMin(int productiveMin) {
//        sharedPreferences.edit().putInt(PRODUCTIVE_MIN, productiveMin).apply();
//    }
//
//    @Override
//    public int getSettingsProductiveStep() {
//        return sharedPreferences.getInt(PRODUCTIVE_STEP, 10);
//    }
//
//    @Override
//    public void setSettingsProductiveStep(int productiveStep) {
//        sharedPreferences.edit().putInt(PRODUCTIVE_STEP, productiveStep).apply();
//    }
}
