package com.example.bionintelligence.domain.usecase;

import android.util.Pair;

import com.example.bionintelligence.data.model.PhasesImgModel;
import com.example.bionintelligence.data.model.PhasesInfoModel;
import com.example.bionintelligence.data.model.PhasesModel;
import com.example.bionintelligence.domain.entities.CalculatorParams;

import io.reactivex.Flowable;
import io.reactivex.Single;

public abstract class FlowableUseCase<PARAMS, VALUE> {

    public abstract Single<CalculatorParams> getCalculatorParams();

    public abstract void setParamsData(CalculatorParams params);

    public abstract Single<Pair<PhasesModel, PhasesImgModel>> getPhasesData(int productive, int cultureId);


    public abstract Single<PhasesInfoModel> getPhasesInfo(int cultureId);

    public abstract Flowable<VALUE> execute(PARAMS params);

}
