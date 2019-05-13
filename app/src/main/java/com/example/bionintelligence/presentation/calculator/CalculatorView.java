package com.example.bionintelligence.presentation.calculator;

import com.example.bionintelligence.data.model.CalculatorModel;
import com.example.bionintelligence.data.model.PhasesImgModel;
import com.example.bionintelligence.data.model.ProductiveInfoModel;
import com.example.bionintelligence.data.model.PhasesModel;
import com.example.bionintelligence.domain.entities.CalculatorParams;

public interface  CalculatorView {
    void displayCalculatorParams(CalculatorParams params);

    void getCalculatorData();

    void getPhasesData();


    void getProductiveInfo();

    void displayCalculatorData(CalculatorModel calculatorModel);

    void displayPhasesData(PhasesModel phases, PhasesImgModel phasesImg);

    void setProductiveInfo(ProductiveInfoModel params);
}
