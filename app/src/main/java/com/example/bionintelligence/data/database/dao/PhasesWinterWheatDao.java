package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesWinterRapeModel;
import com.example.bionintelligence.data.model.PhasesWinterWheatModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesWinterWheatDao {

    @Query("SELECT * FROM PhasesWinterWheatModel")
    Flowable<List<PhasesWinterWheatModel>> getList();

    @Query("SELECT * FROM PhasesWinterWheatModel WHERE productive IS :productive")
    Single<PhasesWinterWheatModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesWinterWheatModel phasesWinterWheatModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesWinterWheatModel> phasesWinterWheatList);

    @Query("DELETE FROM PhasesWinterWheatModel WHERE id IS :id")
    void deleteById(int id);
}
