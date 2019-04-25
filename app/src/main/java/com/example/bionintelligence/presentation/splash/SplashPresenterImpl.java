package com.example.bionintelligence.presentation.splash;

import com.example.bionintelligence.domain.repositories.CalculatorRepository;

public class SplashPresenterImpl implements SplashPresenter {
    private CalculatorRepository calculatorRepository;
    private SplashView splashView;

    SplashPresenterImpl(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    @Override
    public void attachView(SplashView splashView) {
        this.splashView = splashView;
    }

    @Override
    public void checkLocalData() {
        boolean isDatabaseFull = calculatorRepository.getLocalData();
        if (isDatabaseFull) {
            splashView.goToMainActivity();
        } else {
            calculatorRepository.addStartDataFromDb();
            splashView.goToMainActivity();
        }
    }

    @Override
    public void detachView() {
        splashView = null;
    }
}
