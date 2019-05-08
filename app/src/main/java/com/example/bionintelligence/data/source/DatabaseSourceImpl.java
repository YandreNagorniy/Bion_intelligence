package com.example.bionintelligence.data.source;

import com.example.bionintelligence.App;
import com.example.bionintelligence.data.database.dao.CalculatorDao;
import com.example.bionintelligence.data.database.dao.CultureDao;
import com.example.bionintelligence.data.database.dao.PhasesChickpeaDao;
import com.example.bionintelligence.data.database.dao.PhasesCornDao;
import com.example.bionintelligence.data.database.dao.PhasesImgDao;
import com.example.bionintelligence.data.database.dao.PhasesPotatoesDao;
import com.example.bionintelligence.data.database.dao.PhasesSoyDao;
import com.example.bionintelligence.data.database.dao.PhasesSpringRapeDao;
import com.example.bionintelligence.data.database.dao.PhasesSpringWheatDao;
import com.example.bionintelligence.data.database.dao.PhasesSugarBeetDao;
import com.example.bionintelligence.data.database.dao.PhasesSunFlowerDao;
import com.example.bionintelligence.data.database.dao.PhasesWinterRapeDao;
import com.example.bionintelligence.data.database.dao.PhasesWinterWheatDao;
import com.example.bionintelligence.data.database.start.AddStartData;
import com.example.bionintelligence.data.model.CultureModel;
import com.example.bionintelligence.data.model.PhasesChickpeaModel;
import com.example.bionintelligence.data.model.PhasesCornModel;
import com.example.bionintelligence.data.model.PhasesImgModel;
import com.example.bionintelligence.data.model.PhasesPotatoesModel;
import com.example.bionintelligence.data.model.PhasesSoyModel;
import com.example.bionintelligence.data.model.PhasesSpringRapeModel;
import com.example.bionintelligence.data.model.PhasesSpringWheatModel;
import com.example.bionintelligence.data.model.PhasesSugarBeetModel;
import com.example.bionintelligence.data.model.PhasesSunFlowerModel;
import com.example.bionintelligence.data.model.PhasesWinterRapeModel;
import com.example.bionintelligence.data.model.PhasesWinterWheatModel;
import com.example.bionintelligence.domain.entities.CalculateCaOEntity;
import com.example.bionintelligence.domain.entities.CalculateH2OEntity;
import com.example.bionintelligence.domain.entities.CalculateK2OEntity;
import com.example.bionintelligence.domain.entities.CalculateMgOEntity;
import com.example.bionintelligence.domain.entities.CalculateNEntity;
import com.example.bionintelligence.domain.entities.CalculateP2O5Entity;
import com.example.bionintelligence.domain.entities.CalculateSEntity;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class DatabaseSourceImpl implements DatabaseSource {
    private CalculatorDao calculatorDao;
    private CultureDao cultureDao;
    private PhasesImgDao phasesImgDao;
    private PhasesSoyDao phasesSoyDao;
    private PhasesPotatoesDao phasesPotatoesDao;
    private PhasesCornDao phasesCornDao;
    private PhasesChickpeaDao phasesChickpeaDao;
    private PhasesSpringRapeDao phasesSpringRapeDao;
    private PhasesSpringWheatDao phasesSpringWheatDao;
    private PhasesSugarBeetDao phasesSugarBeetDao;
    private PhasesSunFlowerDao phasesSunFlowerDao;
    private PhasesWinterRapeDao phasesWinterRapeDao;
    private PhasesWinterWheatDao phasesWinterWheatDao;

    //что елси делать это не в конструкторе а в методах?
    public DatabaseSourceImpl() {
        calculatorDao = App.getInstance().getDatabase().calculatorDao();
        cultureDao = App.getInstance().getDatabase().cultureDao();
        phasesImgDao = App.getInstance().getDatabase().phasesImgDao();
        phasesChickpeaDao = App.getInstance().getDatabase().phasesChickpeaDao();
        phasesCornDao = App.getInstance().getDatabase().phasesCornDao();
        phasesPotatoesDao = App.getInstance().getDatabase().phasesPotatoesDao();
        phasesSoyDao = App.getInstance().getDatabase().phasesSoyDao();
        phasesSpringRapeDao = App.getInstance().getDatabase().phasesSpringRapeDao();
        phasesSpringWheatDao = App.getInstance().getDatabase().phasesSpringWheatDao();
        phasesSugarBeetDao = App.getInstance().getDatabase().phasesSugarBeetDao();
        phasesSunFlowerDao = App.getInstance().getDatabase().phasesSunFlowerDao();
        phasesWinterRapeDao = App.getInstance().getDatabase().phasesWinterRapeDao();
        phasesWinterWheatDao = App.getInstance().getDatabase().phasesWinterWheatDao();
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

    @Override
    public Flowable<List<CultureModel>> getCultureList() {
        return cultureDao.getList();
    }

    @Override
    public Single<PhasesImgModel> getPhaseImg(int cultureId) {
        return phasesImgDao.getByCultureId(cultureId);
    }

    @Override
    public Single<PhasesChickpeaModel> getPhasesChickpea(int productive) {
        return phasesChickpeaDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesCornModel> getPhasesCorn(int productive) {
        return phasesCornDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesPotatoesModel> getPhasesPotatoes(int productive) {
        return phasesPotatoesDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesSoyModel> getPhasesSoy(int productive) {
        return phasesSoyDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesSpringRapeModel> getPhasesSpringRape(int productive) {
        return phasesSpringRapeDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesSpringWheatModel> getPhasesSpringWheat(int productive) {
        return phasesSpringWheatDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesSugarBeetModel> getPhasesSugarBeet(int productive) {
        return phasesSugarBeetDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesSunFlowerModel> getPhasesSunFlower(int productive) {
        return phasesSunFlowerDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesWinterRapeModel> getPhasesWinterRape(int productive) {
        return phasesWinterRapeDao.getByProductive(productive);
    }

    @Override
    public Single<PhasesWinterWheatModel> getPhasesWinterWheat(int productive) {
        return phasesWinterWheatDao.getByProductive(productive);
    }
}
