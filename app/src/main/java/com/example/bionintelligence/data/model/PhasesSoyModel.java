package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PhasesSoyModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double threeFiveListiev;
    private double butonizacia;
    private double naliv;

    private int threeFiveListievImg;
    private int butonizaciaImg;
    private int nalivImg;

    public PhasesSoyModel(int productive, double threeFiveListiev, double butonizacia, double naliv,
                          int threeFiveListievImg, int butonizaciaImg, int nalivImg) {
        this.productive = productive;
        this.threeFiveListiev = threeFiveListiev;
        this.butonizacia = butonizacia;
        this.naliv = naliv;
        this.threeFiveListievImg = threeFiveListievImg;
        this.butonizaciaImg = butonizaciaImg;
        this.nalivImg = nalivImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getThreeFiveListievImg() {
        return threeFiveListievImg;
    }

    public void setThreeFiveListievImg(int threeFiveListievImg) {
        this.threeFiveListievImg = threeFiveListievImg;
    }

    public int getButonizaciaImg() {
        return butonizaciaImg;
    }

    public void setButonizaciaImg(int butonizaciaImg) {
        this.butonizaciaImg = butonizaciaImg;
    }

    public int getNalivImg() {
        return nalivImg;
    }

    public void setNalivImg(int nalivImg) {
        this.nalivImg = nalivImg;
    }
}
