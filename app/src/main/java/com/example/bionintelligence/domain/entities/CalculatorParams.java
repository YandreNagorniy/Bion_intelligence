package com.example.bionintelligence.domain.entities;

public class CalculatorParams {
    private int productive;
    private int cultureId;
//    private String cultureName;
//    private int productiveMax;
//    private int productiveMin;
//    private int productiveStep;

    public CalculatorParams(int productive, int cultureId) {
        this.productive = productive;
        this.cultureId = cultureId;
    }

//    public CalculatorParams(int productive, int cultureId, String cultureName, int productiveMax, int productiveMin,
//                            int productiveStep) {
//        this.productive = productive;
//        this.cultureId = cultureId;
//        this.cultureName = cultureName;
//        this.productiveMax = productiveMax;
//        this.productiveMin = productiveMin;
//        this.productiveStep = productiveStep;
//    }

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

//    public String getCultureName() {
//        return cultureName;
//    }
//
//    public void setCultureName(String cultureName) {
//        this.cultureName = cultureName;
//    }
//
//    public int getProductiveMax() {
//        return productiveMax;
//    }
//
//    public void setProductiveMax(int productiveMax) {
//        this.productiveMax = productiveMax;
//    }
//
//    public int getProductiveMin() {
//        return productiveMin;
//    }
//
//    public void setProductiveMin(int productiveMin) {
//        this.productiveMin = productiveMin;
//    }
//
//    public int getProductiveStep() {
//        return productiveStep;
//    }
//
//    public void setProductiveStep(int productiveStep) {
//        this.productiveStep = productiveStep;
//    }
}

