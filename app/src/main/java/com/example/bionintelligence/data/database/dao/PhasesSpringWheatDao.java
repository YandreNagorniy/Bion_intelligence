package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesSpringWheatModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesSpringWheatDao {

    @Query("SELECT * FROM PhasesSpringWheatModel")
    Flowable<List<PhasesSpringWheatModel>> getList();

    @Query("SELECT * FROM PhasesSpringWheatModel WHERE productive IS :productive")
    Single<PhasesSpringWheatModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesSpringWheatModel phasesSpringWheatModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesSpringWheatModel> phasesSpringWheatList);

    @Query("DELETE FROM PhasesSpringWheatModel WHERE id IS :id")
    void deleteById(int id);
}
