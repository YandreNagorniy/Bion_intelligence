package com.example.bionintelligence.presentation.calculator;

import com.example.bionintelligence.data.model.CalculatorModel;
import com.example.bionintelligence.domain.entities.CalculatorParams;

public interface CalculatorView {

    void getCalculatorData(int productive, int cultureId);

    void displayCalculatorParams(CalculatorParams params);

    void displayData(CalculatorModel calculatorModel);
}
