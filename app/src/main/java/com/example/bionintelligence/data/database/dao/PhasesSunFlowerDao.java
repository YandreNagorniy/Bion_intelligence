package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesSugarBeetModel;
import com.example.bionintelligence.data.model.PhasesSunFlowerModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesSunFlowerDao {

    @Query("SELECT * FROM PhasesSunFlowerModel")
    Flowable<List<PhasesSunFlowerModel>> getList();

    @Query("SELECT * FROM PhasesSunFlowerModel WHERE productive IS :productive")
    Single<PhasesSunFlowerModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesSunFlowerModel phasesSunFlowerModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesSunFlowerModel> phasesSunFlowerList);

    @Query("DELETE FROM PhasesSunFlowerModel WHERE id IS :id")
    void deleteById(int id);
}
