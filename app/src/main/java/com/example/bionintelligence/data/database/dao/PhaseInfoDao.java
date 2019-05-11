package com.example.bionintelligence.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.bionintelligence.data.model.PhasesInfoModel;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface PhaseInfoDao {
    @Query("SELECT * FROM PhasesInfoModel WHERE cultureId IS :cultureId")
    Single<PhasesInfoModel> getPhasesInfo(int cultureId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PhasesInfoModel phasesInfoModel);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertList(List<PhasesInfoModel> phasesInfoModelList);
}
