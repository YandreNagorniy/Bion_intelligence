package com.example.bionintelligence.domain.usecase;

import com.example.bionintelligence.domain.entities.CalculatorParams;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;

public abstract class FlowableUseCase<PARAMS, VALUE> {

    public abstract Single<CalculatorParams> getCalculatorParams();

    public abstract void setParamsData(CalculatorParams params);

    public abstract Flowable<VALUE> execute(PARAMS params);
}
