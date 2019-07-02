package com.example.bionintelligence.data.repositories;

import io.reactivex.Completable;

public interface PutDatabaseRepository {
    boolean getLocalData();

    Completable addStartDataFromDb();
}
