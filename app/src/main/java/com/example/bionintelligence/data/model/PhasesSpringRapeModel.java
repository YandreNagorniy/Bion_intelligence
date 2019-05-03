package com.example.bionintelligence.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = CultureModel.class, parentColumns = "id", childColumns = "cultureId",onDelete = CASCADE))
public class PhasesSpringRapeModel {
    @ColumnInfo(index = true)
    private int cultureId;
    private int productive;
    private double steblevanie;
    private double butonizacia;
    private double polnoeCvetenie;
    private int imgLink;

    public PhasesSpringRapeModel(int cultureId, int productive, double steblevanie, double butonizacia, double polnoeCvetenie, int imgLink) {
        this.cultureId = cultureId;
        this.productive = productive;
        this.steblevanie = steblevanie;
        this.butonizacia = butonizacia;
        this.polnoeCvetenie = polnoeCvetenie;
        this.imgLink = imgLink;
    }

    public int getCultureId() {
        return cultureId;
    }

    public void setCultureId(int cultureId) {
        this.cultureId = cultureId;
    }

    public int getProductive() {
        return productive;
    }

    public void setProductive(int productive) {
        this.productive = productive;
    }

    public double getSteblevanie() {
        return steblevanie;
    }

    public void setSteblevanie(double steblevanie) {
        this.steblevanie = steblevanie;
    }

    public double getButonizacia() {
        return butonizacia;
    }

    public void setButonizacia(double butonizacia) {
        this.butonizacia = butonizacia;
    }

    public double getPolnoeCvetenie() {
        return polnoeCvetenie;
    }

    public void setPolnoeCvetenie(double polnoeCvetenie) {
        this.polnoeCvetenie = polnoeCvetenie;
    }

    public int getImgLink() {
        return imgLink;
    }

    public void setImgLink(int imgLink) {
        this.imgLink = imgLink;
    }
}
