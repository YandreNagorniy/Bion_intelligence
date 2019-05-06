package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesSugarBeetModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesSugarBeetDao {

    @Query("SELECT * FROM PhasesSugarBeetModel")
    Flowable<List<PhasesSugarBeetModel>> getList();

    @Query("SELECT * FROM PhasesSugarBeetModel WHERE productive IS :productive")
    Single<PhasesSugarBeetModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesSugarBeetModel phasesSugarBeetModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesSugarBeetModel> phasesSugarBeetList);

    @Query("DELETE FROM PhasesSugarBeetModel WHERE id IS :id")
    void deleteById(int id);
}
