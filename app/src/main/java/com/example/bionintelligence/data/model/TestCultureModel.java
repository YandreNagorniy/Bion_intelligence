package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class TestCultureModel {
    @PrimaryKey
    private int id;
    private String cultureName;
    private int imgLink;
    @Embedded
    private TestPhasesModel phasesModel;

    public TestCultureModel(int id, String cultureName, int imgLink, TestPhasesModel phasesModel) {
        this.id = id;
        this.cultureName = cultureName;
        this.imgLink = imgLink;
        this.phasesModel = phasesModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCultureName() {
        return cultureName;
    }

    public void setCultureName(String cultureName) {
        this.cultureName = cultureName;
    }

    public int getImgLink() {
        return imgLink;
    }

    public void setImgLink(int imgLink) {
        this.imgLink = imgLink;
    }

    public TestPhasesModel getPhasesModel() {
        return phasesModel;
    }

    public void setPhasesModel(TestPhasesModel phasesModel) {
        this.phasesModel = phasesModel;
    }
}

