package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesCornModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesCornDao {

    @Query("SELECT * FROM PhasesCornModel")
    Flowable<List<PhasesCornModel>> getList();

    @Query("SELECT * FROM PhasesCornModel WHERE productive IS :productive")
    Single<PhasesCornModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesCornModel phasesCornModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesCornModel> phasesCornList);

    @Query("DELETE FROM PhasesCornModel WHERE id IS :id")
    void deleteById(int id);
}
