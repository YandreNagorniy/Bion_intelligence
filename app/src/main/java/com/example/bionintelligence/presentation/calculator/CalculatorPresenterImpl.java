package com.example.bionintelligence.presentation.calculator;

import com.example.bionintelligence.data.map.ElementMapper;
import com.example.bionintelligence.data.model.TestCultureModel;
import com.example.bionintelligence.data.model.TestPhasesModel;
import com.example.bionintelligence.domain.entities.CalculatorParams;
import com.example.bionintelligence.domain.entities.ElementModelEntity;
import com.example.bionintelligence.domain.repositories.CalculatorRepository;
import com.example.bionintelligence.domain.usecase.FlowableUseCase;
import com.example.bionintelligence.presentation.map.PhasesValueMapper;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class CalculatorPresenterImpl implements CalculatorPresenter {
    private FlowableUseCase<CalculatorParams, List<ElementModelEntity>> getCalculatorUseCase;
    private CompositeDisposable compositeDisposable;
    private CalculatorRepository calculatorRepository;
    private CalculatorView calculatorView;

    CalculatorPresenterImpl(FlowableUseCase<CalculatorParams, List<ElementModelEntity>> getCalculatorUseCase,
                            CalculatorRepository calculatorRepository) {
        this.getCalculatorUseCase = getCalculatorUseCase;
        this.calculatorRepository = calculatorRepository;
        this.compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void attachView(CalculatorView calculatorView) {
        this.calculatorView = calculatorView;
    }

    @Override
    public void setParamsData(CalculatorParams params) {
        calculatorRepository.setCalculatorParams(params);
    }

    @Override
    public void getStartData() {
        compositeDisposable.add(calculatorRepository.getCalculatorParams()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(params -> {
//                    getCalculatorData(params.getProductive(), params.getCultureId());
                    getCultureModel(params.getCultureId());
                }));
    }

    @Override
    public void getCalculatorData(int productive, int cultureId) {
        compositeDisposable.add(getCalculatorUseCase.execute(new CalculatorParams(productive, cultureId))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map(ElementMapper::mapToCalculatorModel)
                .subscribe(calculatorModel ->
                        calculatorView.displayCalculatorData(calculatorModel)));
    }

    @Override
    public void getCultureModel(int cultureId) {
        compositeDisposable.add(calculatorRepository.getTestCultureModel(cultureId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(testCultureModel -> calculatorView.displayCultureData(testCultureModel)));
    }

    @Override
    public void getPhasesData(List<TestPhasesModel> phasesModelList, int productive) {
        compositeDisposable.add(Single.just(phasesModelList)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map(testPhasesModels -> PhasesValueMapper.mapPhasesByProductive(testPhasesModels, productive))
                .subscribe(phasesModel -> calculatorView.displayPhasesData(phasesModel))
        );
    }

    @Override
    public void detachView() {
        compositeDisposable.dispose();
        calculatorView = null;
    }
}
