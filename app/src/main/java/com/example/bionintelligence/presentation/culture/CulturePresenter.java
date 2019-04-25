package com.example.bionintelligence.presentation.culture;

public interface CulturePresenter {
    void attachView(CultureView cultureView);

    void detachView();

    void getCultureData();
}
