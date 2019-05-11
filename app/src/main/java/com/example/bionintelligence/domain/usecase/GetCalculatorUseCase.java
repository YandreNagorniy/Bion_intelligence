package com.example.bionintelligence.domain.usecase;

import android.util.Pair;

import com.example.bionintelligence.data.model.PhasesImgModel;
import com.example.bionintelligence.data.model.PhasesInfoModel;
import com.example.bionintelligence.data.model.PhasesModel;
import com.example.bionintelligence.data.repositories.CalculatorRepositoryImpl;
import com.example.bionintelligence.domain.entities.CalculateCaOEntity;
import com.example.bionintelligence.domain.entities.CalculateH2OEntity;
import com.example.bionintelligence.domain.entities.CalculateK2OEntity;
import com.example.bionintelligence.domain.entities.CalculateMgOEntity;
import com.example.bionintelligence.domain.entities.CalculateNEntity;
import com.example.bionintelligence.domain.entities.CalculateP2O5Entity;
import com.example.bionintelligence.domain.entities.CalculateSEntity;
import com.example.bionintelligence.domain.entities.CalculatorParams;
import com.example.bionintelligence.domain.entities.ElementModelEntity;
import com.example.bionintelligence.domain.entities.TypeElementEntity;
import com.example.bionintelligence.domain.repositories.CalculatorRepository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class GetCalculatorUseCase extends FlowableUseCase<CalculatorParams, List<ElementModelEntity>> {
    private CalculatorRepository calculatorRepository;
    private CalculatorParams params;

    public GetCalculatorUseCase(CalculatorRepositoryImpl repository) {
        this.calculatorRepository = repository;
    }

    @Override
    public Single<CalculatorParams> getCalculatorParams() {
        return calculatorRepository.getCalculatorParams();
    }

    @Override
    public void setParamsData(CalculatorParams params) {
        calculatorRepository.setCalculatorParams(params);
    }

    @Override
    public Single<Pair<PhasesModel, PhasesImgModel>> getPhasesData(int productive, int cultureId) {
        return calculatorRepository.getPhasesData(productive, cultureId);
    }

    @Override
    public Single<PhasesInfoModel> getPhasesInfo(int cultureId) {
        return calculatorRepository.getPhasesInfo(cultureId);
    }

    @Override
    public Flowable<List<ElementModelEntity>> execute(CalculatorParams params) {
        this.params = params;
        List<Single<ElementModelEntity>> list = new ArrayList<>();
        list.add(getDataN(params.getCultureId()));
        list.add(getDataP2O5(params.getCultureId()));
        list.add(getDataK2O(params.getCultureId()));
        list.add(getDataCaO(params.getCultureId()));
        list.add(getDataMgO(params.getCultureId()));
        list.add(getDataS(params.getCultureId()));
        list.add(getDataH20(params.getCultureId()));

        return Single.concat(list)
                .observeOn(AndroidSchedulers.mainThread())
                .buffer(7)
                .cache();

    }


    private Single<ElementModelEntity> getDataN(int cultureId) {
        return calculatorRepository.getDataN(cultureId)
                .subscribeOn(Schedulers.io())
                .map(doubleCalculateNPair -> calculateN(doubleCalculateNPair.first, doubleCalculateNPair.second))
                .map(n -> new ElementModelEntity(TypeElementEntity.N, n));
    }

    private Single<ElementModelEntity> getDataP2O5(int cultureId) {
        return calculatorRepository.getDataP2O5(cultureId)
                .subscribeOn(Schedulers.io())
                .map(doubleCalculateP2O5Pair -> calculateP2O5(doubleCalculateP2O5Pair.first, doubleCalculateP2O5Pair.second))
                .map(p2O5 -> new ElementModelEntity(TypeElementEntity.P2O5, p2O5));

    }

    private Single<ElementModelEntity> getDataK2O(int cultureId) {
        return calculatorRepository.getDataK2O(cultureId)
                .subscribeOn(Schedulers.io())
                .map(doubleCalculateK2OPair -> calculateK2O(doubleCalculateK2OPair.first, doubleCalculateK2OPair.second))
                .map(k2O -> new ElementModelEntity(TypeElementEntity.K2O, k2O));
    }

    private Single<ElementModelEntity> getDataCaO(int cultureId) {
        return calculatorRepository.getDataCaO(cultureId)
                .subscribeOn(Schedulers.io())
                .map(doubleCalculateCaOPair -> calculateCaO(doubleCalculateCaOPair.first, doubleCalculateCaOPair.second))
                .map(caO -> new ElementModelEntity(TypeElementEntity.CaO, caO));
    }

    private Single<ElementModelEntity> getDataMgO(int cultureId) {
        return calculatorRepository.getDataMgO(cultureId)
                .subscribeOn(Schedulers.io())
                .map(doubleCalculateMgOPair -> calculateMgO(doubleCalculateMgOPair.first, doubleCalculateMgOPair.second))
                .map(mgO -> new ElementModelEntity(TypeElementEntity.MgO, mgO));
    }

    private Single<ElementModelEntity> getDataS(int cultureId) {
        return calculatorRepository.getDataS(cultureId)
                .subscribeOn(Schedulers.io())
                .map(doubleCalculateSPair -> calculateS(doubleCalculateSPair.first, doubleCalculateSPair.second))
                .map(s -> new ElementModelEntity(TypeElementEntity.S, s));
    }

    private Single<ElementModelEntity> getDataH20(int cultureId) {
        return calculatorRepository.getDataH2O(cultureId)
                .subscribeOn(Schedulers.io())
                .map(this::calculateH2O)
                .map(h2O -> new ElementModelEntity(TypeElementEntity.H2O, h2O));
    }

    private int calculateN(Double phN, CalculateNEntity calculateNEntity) {
        double sf_N = calculateNEntity.sf_N;
        double sf_G = calculateNEntity.sf_G;
        double kusv_N = calculateNEntity.kusv_N;
        double vinos_N = calculateNEntity.vinos_N;
        double x;
        double n;

        if (sf_G > 4) {
            x = 64 + sf_G * 0.16;
        } else {
            x = sf_G * 16;
        }

        n = vinos_N * params.getProductive() - (sf_N * 3.96 * kusv_N * phN + x);


        return n < 0 ? 0 : (int) Math.round(n);
    }

    private int calculateP2O5(Double phP2O5, CalculateP2O5Entity calculateP2O5Entity) {
        double vinos_P2O5 = calculateP2O5Entity.vinos_P2O5;
        double sf_P2O5 = calculateP2O5Entity.sf_P2O5;
        double kusv_P2O5 = calculateP2O5Entity.kusv_P2O5;
        double p2O5 = vinos_P2O5 * params.getProductive() - sf_P2O5 * kusv_P2O5 * 3.96 * phP2O5;

        return p2O5 < 0 ? 0 : (int) Math.round(p2O5);
    }

    private int calculateK2O(Double phK2O, CalculateK2OEntity calculateK2OEntity) {
        double vinos_K2O = calculateK2OEntity.vinos_K2O;
        double sf_K2O = calculateK2OEntity.sf_K2O;
        double kusv_K2O = calculateK2OEntity.kusv_K2O;
        double k2O = vinos_K2O * params.getProductive() - sf_K2O * kusv_K2O * 3.96 * phK2O;

        return k2O < 0 ? 0 : (int) Math.round(k2O);
    }

    private int calculateCaO(Double phCaO, CalculateCaOEntity calculateCaOEntity) {
        double vinos_CaO = calculateCaOEntity.vinos_CaO;
        double sf_CaO = calculateCaOEntity.sf_CaO;
        double kusv_CaO = calculateCaOEntity.kusv_CaO;
        double caO = vinos_CaO * params.getProductive() - sf_CaO * kusv_CaO * 3.96 * 20 * phCaO;

        return caO < 0 ? 0 : (int) Math.round(caO);
    }

    private int calculateMgO(Double phMgO, CalculateMgOEntity calculateMgOEntity) {
        double vinos_MgO = calculateMgOEntity.vinos_MgO;
        double sf_MgO = calculateMgOEntity.sf_MgO;
        double kusv_MgO = calculateMgOEntity.kusv_MgO;
        double mgO = vinos_MgO * params.getProductive() - sf_MgO * kusv_MgO * 3.96 * 12 * phMgO;

        return mgO < 0 ? 0 : (int) Math.round(mgO);
    }

    private int calculateS(Double phS, CalculateSEntity calculateSEntity) {
        double vinos_S = calculateSEntity.vinos_S;
        double sf_S = calculateSEntity.sf_S;
        double kusv_S = calculateSEntity.kusv_S;
        double s = vinos_S * params.getProductive() - sf_S * kusv_S * 3.96 * phS;

        return s < 0 ? 0 : (int) Math.round(s);
    }

    private int calculateH2O(CalculateH2OEntity calculateH2OEntity) {
        double waterConsumption_value = calculateH2OEntity.waterConsumption_value;
        double sf_zpv = calculateH2OEntity.sf_zpv;
        double h2O = (params.getProductive() * waterConsumption_value * 0.043) - sf_zpv;

        return h2O < 0 ? 0 : (int) Math.round(h2O);
    }

//    public static class Params {
//
//        private int productive;
//        private int cultureId;
//
//        public Params(int productive, int cultureId) {
//            this.productive = productive;
//            this.cultureId = cultureId;
//        }
//
//        public int getProductive() {
//            return productive;
//        }
//
//        public void setProductive(int productive) {
//            this.productive = productive;
//        }
//
//        public int getCultureId() {
//            return cultureId;
//        }
//
//        public void setCultureId(int cultureId) {
//            this.cultureId = cultureId;
//        }
//    }
}
