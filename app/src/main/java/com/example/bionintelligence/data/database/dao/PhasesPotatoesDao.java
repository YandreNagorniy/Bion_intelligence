package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.KUsvModel;
import com.example.bionintelligence.data.model.PhasesPotatoesModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface PhasesPotatoesDao {

    @Query("SELECT * FROM PhasesPotatoesModel")
    Flowable<List<PhasesPotatoesModel>> getList();

    @Query("SELECT * FROM PhasesPotatoesModel WHERE productive IS :productive")
    Single<PhasesPotatoesModel> getByProductive(int productive);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesPotatoesModel phasesPotatoesModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesPotatoesModel> phasesPotatoesList);

    @Query("DELETE FROM PhasesPotatoesModel WHERE id IS :id")
    void deleteById(int id);
}
