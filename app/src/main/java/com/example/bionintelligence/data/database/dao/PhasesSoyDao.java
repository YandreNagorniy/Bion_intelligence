package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesCornModel;
import com.example.bionintelligence.data.model.PhasesSoyModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesSoyDao {

    @Query("SELECT * FROM PhasesSoyModel")
    Flowable<List<PhasesSoyModel>> getList();

    @Query("SELECT * FROM PhasesSoyModel WHERE productive IS :productive")
    Single<PhasesSoyModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesSoyModel phasesSoyModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesSoyModel> phasesSoyList);

    @Query("DELETE FROM PhasesSoyModel WHERE id IS :id")
    void deleteById(int id);
}
