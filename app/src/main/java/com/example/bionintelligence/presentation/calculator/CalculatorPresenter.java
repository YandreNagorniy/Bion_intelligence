package com.example.bionintelligence.presentation.calculator;

import com.example.bionintelligence.domain.entities.CalculatorParams;

public interface CalculatorPresenter {
    void attachView(CalculatorView calculatorView);

    void setParamsData(CalculatorParams params);

    void getParamsData();

    void getCalculatorData(int productive, int cultureId);

    void detachView();

}
