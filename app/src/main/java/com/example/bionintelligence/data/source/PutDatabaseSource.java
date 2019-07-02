package com.example.bionintelligence.data.source;

import io.reactivex.Completable;

public interface PutDatabaseSource {
    boolean getLocalData();

    void setLocalData(boolean isFull);

    Completable fillDataInDB();
}
