package com.example.bionintelligence.presentation.calculator;

import com.example.bionintelligence.data.map.ElementMapper;
import com.example.bionintelligence.domain.entities.CalculatorParams;
import com.example.bionintelligence.domain.entities.ElementModelEntity;
import com.example.bionintelligence.domain.usecase.FlowableUseCase;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class CalculatorPresenterImpl implements CalculatorPresenter {
    private FlowableUseCase<CalculatorParams, List<ElementModelEntity>> getCalculatorUseCase;
    private CompositeDisposable compositeDisposable;
    private CalculatorView calculatorView;

    CalculatorPresenterImpl(FlowableUseCase<CalculatorParams, List<ElementModelEntity>> getCalculatorUseCase) {
        this.getCalculatorUseCase = getCalculatorUseCase;
        this.compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void attachView(CalculatorView calculatorView) {
        this.calculatorView = calculatorView;
    }

    @Override
    public void setParamsData(CalculatorParams params) {
        getCalculatorUseCase.setParamsData(params);
    }

    @Override
    public void getParamsData() {
        compositeDisposable.add(getCalculatorUseCase.getCalculatorParams()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(params -> calculatorView.displayCalculatorParams(params)));
    }

    @Override
    public void getCalculatorData(int productive, int cultureId) {
        compositeDisposable.add(getCalculatorUseCase.execute(new CalculatorParams(productive, cultureId))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map(ElementMapper::mapToCalculatorModel)
                .subscribe(calculatorModel -> calculatorView.displayData(calculatorModel)));
    }

    @Override
    public void detachView() {
        compositeDisposable.dispose();
        calculatorView = null;
    }
}
