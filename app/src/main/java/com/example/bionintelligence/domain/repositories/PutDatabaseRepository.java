package com.example.bionintelligence.domain.repositories;

import io.reactivex.Completable;

public interface PutDatabaseRepository {
    boolean getLocalData();

    Completable addStartDataFromDb();
}
