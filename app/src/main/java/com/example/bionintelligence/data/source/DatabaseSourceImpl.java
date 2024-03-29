package com.example.bionintelligence.data.source;

import com.example.bionintelligence.App;
import com.example.bionintelligence.data.database.dao.CalculatorDao;
import com.example.bionintelligence.data.database.start.AddStartData;
import com.example.bionintelligence.domain.entities.CalculateCaOEntity;
import com.example.bionintelligence.domain.entities.CalculateH2OEntity;
import com.example.bionintelligence.domain.entities.CalculateK2OEntity;
import com.example.bionintelligence.domain.entities.CalculateMgOEntity;
import com.example.bionintelligence.domain.entities.CalculateNEntity;
import com.example.bionintelligence.domain.entities.CalculateP2O5Entity;
import com.example.bionintelligence.domain.entities.CalculateSEntity;

import io.reactivex.Single;

public class DatabaseSourceImpl implements DatabaseSource {
    private CalculatorDao calculatorDao;

    public DatabaseSourceImpl() {
        calculatorDao = App.getInstance().getDatabase().calculatorDao();
    }

    @Override
    public void addStartData() {
        AddStartData.addAllData();
    }

    @Override
    public Single<CalculateNEntity> getDataN(int id) {
        return calculatorDao.getDataN(id);
    }

    @Override
    public Single<Double> getPhN(double sf_pH) {
        return calculatorDao.getPhN(sf_pH);
    }

    @Override
    public Single<CalculateP2O5Entity> getDataP2O5(int id) {
        return calculatorDao.getDataP2O5(id);
    }

    @Override
    public Single<Double> getPhP2O5(double sf_pH) {
        return calculatorDao.getPhP2O5(sf_pH);
    }

    @Override
    public Single<CalculateK2OEntity> getDataK2O(int id) {
        return calculatorDao.getDataK2O(id);
    }

    @Override
    public Single<Double> getPhK2O(double sf_pH) {
        return calculatorDao.getPhK2O(sf_pH);
    }

    @Override
    public Single<CalculateCaOEntity> getDataCaO(int id) {
        return calculatorDao.getDataCaO(id);
    }

    @Override
    public Single<Double> getPhCaO(double sf_pH) {
        return calculatorDao.getPhCaO(sf_pH);
    }

    @Override
    public Single<CalculateMgOEntity> getDataMgO(int id) {
        return calculatorDao.getDataMgO(id);
    }

    @Override
    public Single<Double> getPhMgO(double sf_pH) {
        return calculatorDao.getPhMgO(sf_pH);
    }

    @Override
    public Single<CalculateSEntity> getDataS(int id) {
        return calculatorDao.getDataS(id);
    }

    @Override
    public Single<Double> getPhS(double sf_pH) {
        return calculatorDao.getPhS(sf_pH);
    }

    @Override
    public Single<CalculateH2OEntity> getDataH2O(int id) {
        return calculatorDao.getDataH2O(id);
    }
}
