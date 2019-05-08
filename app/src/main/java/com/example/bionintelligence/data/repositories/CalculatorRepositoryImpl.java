package com.example.bionintelligence.data.repositories;

import android.util.Pair;

import com.example.bionintelligence.data.source.DatabaseSource;
import com.example.bionintelligence.data.source.LocalSource;
import com.example.bionintelligence.domain.entities.CalculateCaOEntity;
import com.example.bionintelligence.domain.entities.CalculateH2OEntity;
import com.example.bionintelligence.domain.entities.CalculateK2OEntity;
import com.example.bionintelligence.domain.entities.CalculateMgOEntity;
import com.example.bionintelligence.domain.entities.CalculateNEntity;
import com.example.bionintelligence.domain.entities.CalculateP2O5Entity;
import com.example.bionintelligence.domain.entities.CalculateSEntity;
import com.example.bionintelligence.domain.entities.CalculatorParams;
import com.example.bionintelligence.domain.repositories.CalculatorRepository;
import com.example.bionintelligence.presentation.pojo.PhaseModel;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class CalculatorRepositoryImpl implements CalculatorRepository {
    private LocalSource localSource;
    private DatabaseSource databaseSource;

    public CalculatorRepositoryImpl(LocalSource localSource, DatabaseSource databaseSource) {
        this.localSource = localSource;
        this.databaseSource = databaseSource;
    }

    @Override
    public boolean getLocalData() {
        return localSource.getLocalData();
    }

    @Override
    public Single<CalculatorParams> getCalculatorParams() {
        return Single.just(new CalculatorParams(localSource.getSettingsCultureProductive(),
                localSource.getSettingsCultureId(), localSource.getSettingsCultureName()));
    }

    @Override
    public void setCalculatorParams(CalculatorParams params) {
        localSource.setSettingsCultureProductive(params.getProductive());
        localSource.setSettingsCultureId(params.getCultureId());
        localSource.setSettingsCultureName(params.getCultureName());
    }

    @Override
    public void addStartDataFromDb() {
        databaseSource.addStartData();
        localSource.setLocalData(true);
    }

    //Данные калькулятора
    @Override
    public Single<Pair<Double, CalculateNEntity>> getDataN(int id) {
        return databaseSource.getDataN(id)
                .subscribeOn(Schedulers.io())
                .flatMap(calculateNEntity -> databaseSource.getPhN(calculateNEntity.sf_pH)
                        .zipWith(Single.just(calculateNEntity), Pair::new));
    }

    @Override
    public Single<Pair<Double, CalculateP2O5Entity>> getDataP2O5(int id) {
        return databaseSource.getDataP2O5(id)
                .subscribeOn(Schedulers.io())
                .flatMap(calculateP2O5Entity -> databaseSource.getPhP2O5(calculateP2O5Entity.sf_pH)
                        .zipWith(Single.just(calculateP2O5Entity), Pair::new));
    }

    @Override
    public Single<Pair<Double, CalculateK2OEntity>> getDataK2O(int id) {
        return databaseSource.getDataK2O(id)
                .subscribeOn(Schedulers.io())
                .flatMap(calculateK2OEntity -> databaseSource.getPhK2O(calculateK2OEntity.sf_pH)
                        .zipWith(Single.just(calculateK2OEntity), Pair::new));
    }

    @Override
    public Single<Pair<Double, CalculateCaOEntity>> getDataCaO(int id) {
        return databaseSource.getDataCaO(id)
                .subscribeOn(Schedulers.io())
                .flatMap(calculateK2OEntity -> databaseSource.getPhCaO(calculateK2OEntity.sf_pH)
                        .zipWith(Single.just(calculateK2OEntity), Pair::new));
    }

    @Override
    public Single<Pair<Double, CalculateMgOEntity>> getDataMgO(int id) {
        return databaseSource.getDataMgO(id)
                .subscribeOn(Schedulers.io())
                .flatMap(calculateK2OEntity -> databaseSource.getPhMgO(calculateK2OEntity.sf_pH)
                        .zipWith(Single.just(calculateK2OEntity), Pair::new));
    }

    @Override
    public Single<Pair<Double, CalculateSEntity>> getDataS(int id) {
        return databaseSource.getDataS(id)
                .subscribeOn(Schedulers.io())
                .flatMap(calculateK2OEntity -> databaseSource.getPhS(calculateK2OEntity.sf_pH)
                        .zipWith(Single.just(calculateK2OEntity), Pair::new));
    }

    @Override
    public Single<CalculateH2OEntity> getDataH2O(int id) {
        return databaseSource.getDataH2O(id);
    }

    @Override
    public Single<List<PhaseModel>> getPhasesData(int productive, int cultureId) {

        return null;
    }
}
