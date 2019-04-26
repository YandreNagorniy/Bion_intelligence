package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class CultureModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String culture;
    private int imgLink;
    private String phasesImgLink;

    public CultureModel(String culture, int imgLink, String phasesImgLink) {
        this.culture = culture;
        this.imgLink = imgLink;
        this.phasesImgLink = phasesImgLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public int getImgLink() {
        return imgLink;
    }

    public void setImgLink(int imgLink) {
        this.imgLink = imgLink;
    }

    public String getPhasesImgLink() {
        return phasesImgLink;
    }

    public void setPhasesImgLink(String phasesImgLink) {
        this.phasesImgLink = phasesImgLink;
    }
}

