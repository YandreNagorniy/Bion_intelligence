package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesSunFlowerModel;
import com.example.bionintelligence.data.model.PhasesWinterRapeModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesWinterRapeDao {

    @Query("SELECT * FROM PhasesWinterRapeModel")
    Flowable<List<PhasesWinterRapeModel>> getList();

    @Query("SELECT * FROM PhasesWinterRapeModel WHERE productive IS :productive")
    Single<PhasesWinterRapeModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesWinterRapeModel phasesWinterRapeModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesWinterRapeModel> phasesWinterRapeList);

    @Query("DELETE FROM PhasesWinterRapeModel WHERE id IS :id")
    void deleteById(int id);
}
