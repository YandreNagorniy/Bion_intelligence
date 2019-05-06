package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.KUsvModel;
import com.example.bionintelligence.data.model.PhasesChickpeaModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesChickpeaDao {

    @Query("SELECT * FROM PhasesChickpeaModel")
    Flowable<List<PhasesChickpeaModel>> getList();

    @Query("SELECT * FROM PhasesChickpeaModel WHERE productive IS :productive")
    Single<PhasesChickpeaModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesChickpeaModel phasesChickpeaModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesChickpeaModel> phasesChickpeaList);

    @Query("DELETE FROM PhasesChickpeaModel WHERE id IS :id")
    void deleteById(int id);
}
