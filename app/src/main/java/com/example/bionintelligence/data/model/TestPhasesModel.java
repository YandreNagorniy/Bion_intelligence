package com.example.bionintelligence.data.model;

import android.arch.persistence.room.TypeConverters;

import com.example.bionintelligence.data.database.converters.TestPhasesConverters;

import java.util.List;

public class TestPhasesModel {
    private int productive;
    @TypeConverters(TestPhasesConverters.class)
    private List<Double> phasesList;

    public TestPhasesModel(int productive, List<Double> phasesList) {
        this.productive = productive;
        this.phasesList = phasesList;
    }

    public int getProductive() {
        return productive;
    }

    public void setProductive(int productive) {
        this.productive = productive;
    }

    public List<Double> getPhasesList() {
        return phasesList;
    }

    public void setPhasesList(List<Double> phasesList) {
        this.phasesList = phasesList;
    }
}
