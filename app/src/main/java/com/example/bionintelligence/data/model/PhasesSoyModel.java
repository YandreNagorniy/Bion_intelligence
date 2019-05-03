package com.example.bionintelligence.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = CultureModel.class, parentColumns = "id", childColumns = "cultureId", onDelete = CASCADE))
public class PhasesSoyModel {
    @ColumnInfo(index = true)
    private int cultureId;
    private int productive;
    private double threeFiveListiev;
    private double butonizacia;
    private double naliv;
    private int imgLink;

    public PhasesSoyModel(int cultureId, int productive, double threeFiveListiev, double butonizacia, double naliv, int imgLink) {
        this.cultureId = cultureId;
        this.productive = productive;
        this.threeFiveListiev = threeFiveListiev;
        this.butonizacia = butonizacia;
        this.naliv = naliv;
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

    public double getThreeFiveListiev() {
        return threeFiveListiev;
    }

    public void setThreeFiveListiev(double threeFiveListiev) {
        this.threeFiveListiev = threeFiveListiev;
    }

    public double getButonizacia() {
        return butonizacia;
    }

    public void setButonizacia(double butonizacia) {
        this.butonizacia = butonizacia;
    }

    public double getNaliv() {
        return naliv;
    }

    public void setNaliv(double naliv) {
        this.naliv = naliv;
    }

    public int getImgLink() {
        return imgLink;
    }

    public void setImgLink(int imgLink) {
        this.imgLink = imgLink;
    }
}
