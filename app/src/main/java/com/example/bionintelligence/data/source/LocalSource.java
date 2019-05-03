package com.example.bionintelligence.data.source;

public interface LocalSource {

    boolean getLocalData();

    int getSettingsCultureId();

    void setLocalData(boolean isFull);

    String getSettingsCultureName();

    void setSettingsCultureId(int cultureId);

    void setSettingsCultureName(String cultureName);

    int getSettingsCultureProductive();

    void setSettingsCultureProductive(int culture_productive);
}
