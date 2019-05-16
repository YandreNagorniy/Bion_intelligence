package com.example.bionintelligence.presentation.calculator;

import com.example.bionintelligence.data.model.TestPhasesModel;
import com.example.bionintelligence.domain.entities.CalculatorParams;

import java.util.List;

public interface CalculatorPresenter {
    void attachView(CalculatorView calculatorView);

    void setParamsData(CalculatorParams params);

//    void getParamsData();

    void getCalculatorData(int productive, int cultureId);

    void getStartData();

    void getCultureModel(int cultureId);

//    void getPhasesData(int value, int parseInt);
//
//    void getProductiveInfo(int cultureId);

    void getPhasesData(List<TestPhasesModel> phasesModelList, int productive);

    void detachView();


}
