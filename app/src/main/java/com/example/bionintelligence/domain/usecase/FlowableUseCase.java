package com.example.bionintelligence.domain.usecase;

import com.example.bionintelligence.domain.entities.CalculatorParams;
import com.example.bionintelligence.presentation.pojo.PhaseModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public abstract class FlowableUseCase<PARAMS, VALUE> {

    public abstract Single<CalculatorParams> getCalculatorParams();

    public abstract void setParamsData(CalculatorParams params);

    public abstract Single<List<PhaseModel>> getPhasesData(int productive, int cultureId);


    public abstract Flowable<VALUE> execute(PARAMS params);

}
