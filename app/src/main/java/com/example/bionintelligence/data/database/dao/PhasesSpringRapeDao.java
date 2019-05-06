package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesSoyModel;
import com.example.bionintelligence.data.model.PhasesSpringRapeModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesSpringRapeDao {

    @Query("SELECT * FROM PhasesSpringRapeModel")
    Flowable<List<PhasesSpringRapeModel>> getList();

    @Query("SELECT * FROM PhasesSpringRapeModel WHERE productive IS :productive")
    Single<PhasesSpringRapeModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesSpringRapeModel phasesSpringRapeModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesSpringRapeModel> phasesSpringRapeList);

    @Query("DELETE FROM PhasesSpringRapeModel WHERE id IS :id")
    void deleteById(int id);
}
