package com.example.bionintelligence.data.source;

import com.example.bionintelligence.data.model.CultureModel;
import com.example.bionintelligence.data.model.PhasesImgModel;
import com.example.bionintelligence.data.model.PhasesInfoModel;
import com.example.bionintelligence.data.model.PhasesModel;
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

public interface DatabaseSource {
    void addStartData();

    Single<CalculateNEntity> getDataN(int id);

    Single<Double> getPhN(double settingsPH);

    Single<CalculateP2O5Entity> getDataP2O5(int id);

    Single<Double> getPhP2O5(double sf_pH);

    Single<CalculateK2OEntity> getDataK2O(int id);

    Single<Double> getPhK2O(double sf_pH);

    Single<CalculateCaOEntity> getDataCaO(int id);

    Single<Double> getPhCaO(double sf_pH);

    Single<CalculateMgOEntity> getDataMgO(int id);

    Single<Double> getPhMgO(double sf_pH);

    Single<CalculateSEntity> getDataS(int id);

    Single<Double> getPhS(double sf_pH);

    Single<CalculateH2OEntity> getDataH2O(int id);

    Flowable<List<CultureModel>> getCultureList();

    Single<PhasesImgModel> getPhaseImg(int cultureId);

    Single<PhasesModel> getPhases(int cultureId, int productive);

    Single<PhasesInfoModel> getPhasesInfo(int cultureId);
}
