package com.example.bionintelligence.data.repositories;

import com.example.bionintelligence.data.source.PutDatabaseSource;
import com.example.bionintelligence.domain.repositories.PutDatabaseRepository;

import io.reactivex.Completable;

public class PutDatabaseRepositoryImpl implements PutDatabaseRepository {
    private PutDatabaseSource putDatabaseSource;

    public PutDatabaseRepositoryImpl(PutDatabaseSource putDatabaseSource) {
        this.putDatabaseSource = putDatabaseSource;
    }

    @Override
    public boolean getLocalData() {
        return putDatabaseSource.getLocalData();
    }

    @Override
    public Completable addStartDataFromDb() {
        return putDatabaseSource.fillDataInDB().doOnComplete(() -> putDatabaseSource.setLocalData(true));
    }
}
