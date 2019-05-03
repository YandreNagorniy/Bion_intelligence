package com.example.bionintelligence.domain.entities;

public class CalculatorParams {
    private int productive;
    private int cultureId;
    private String cultureName;

    public CalculatorParams(int productive, int cultureId) {
        this.productive = productive;
        this.cultureId = cultureId;
    }

    public CalculatorParams(int productive, int cultureId, String cultureName) {
        this.productive = productive;
        this.cultureId = cultureId;
        this.cultureName = cultureName;
    }

    public int getProductive() {
        return productive;
    }

    public void setProductive(int productive) {
        this.productive = productive;
    }

    public int getCultureId() {
        return cultureId;
    }

    public void setCultureId(int cultureId) {
        this.cultureId = cultureId;
    }

    public String getCultureName() {
        return cultureName;
    }

    public void setCultureName(String cultureName) {
        this.cultureName = cultureName;
    }
}

