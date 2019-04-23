package com.example.bionintelligence.domain.repository;

import android.util.Pair;

import com.example.bionintelligence.domain.entities.CalculateCaOEntity;
import com.example.bionintelligence.domain.entities.CalculateH2OEntity;
import com.example.bionintelligence.domain.entities.CalculateK2OEntity;
import com.example.bionintelligence.domain.entities.CalculateMgOEntity;
import com.example.bionintelligence.domain.entities.CalculateNEntity;
import com.example.bionintelligence.domain.entities.CalculateP2O5Entity;
import com.example.bionintelligence.domain.entities.CalculateSEntity;

import io.reactivex.Single;

public interface CalculatorRepository {
    boolean getLocalData();

    void addStartDataFromDb();

    Single<Pair<Double, CalculateNEntity>> getDataN(int id);

    Single<Pair<Double, CalculateP2O5Entity>> getDataP2O5(int id);

    Single<Pair<Double, CalculateK2OEntity>> getDataK2O(int id);

    Single<Pair<Double, CalculateCaOEntity>> getDataCaO(int id);

    Single<Pair<Double, CalculateMgOEntity>> getDataMgO(int id);

    Single<Pair<Double, CalculateSEntity>> getDataS(int id);

    Single<CalculateH2OEntity> getDataH2O(int id);
}
