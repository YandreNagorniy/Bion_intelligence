package com.example.bionintelligence.presentation.calculator;

public interface CalculatorPresenter {
    void attachView(CalculatorView calculatorView);

    void getCalculatorData(int productive);

    void detachView();
}
