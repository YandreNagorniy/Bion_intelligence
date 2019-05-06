package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PhasesSugarBeetModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double twoTreeParaListiev;
    private double fourFiveParaListiev;
    private double smikanieRiadov;
    private double smikanieMejdyRiadov;
    private double nalivCorneploda;

    private int kushenieImg;
    private int twoTreeParaListievImg;
    private int fourFiveParaListievImg;
    private int smikanieRiadovImg;
    private int smikanieMejdyRiadovImg;
    private int nalivCorneplodaImg;

    public PhasesSugarBeetModel(int productive, double twoTreeParaListiev, double fourFiveParaListiev,
                                double smikanieRiadov, double smikanieMejdyRiadov, double nalivCorneploda, int kushenieImg,
                                int twoTreeParaListievImg, int fourFiveParaListievImg, int smikanieRiadovImg,
                                int smikanieMejdyRiadovImg, int nalivCorneplodaImg) {
        this.productive = productive;
        this.twoTreeParaListiev = twoTreeParaListiev;
        this.fourFiveParaListiev = fourFiveParaListiev;
        this.smikanieRiadov = smikanieRiadov;
        this.smikanieMejdyRiadov = smikanieMejdyRiadov;
        this.nalivCorneploda = nalivCorneploda;
        this.kushenieImg = kushenieImg;
        this.twoTreeParaListievImg = twoTreeParaListievImg;
        this.fourFiveParaListievImg = fourFiveParaListievImg;
        this.smikanieRiadovImg = smikanieRiadovImg;
        this.smikanieMejdyRiadovImg = smikanieMejdyRiadovImg;
        this.nalivCorneplodaImg = nalivCorneplodaImg;
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

    public double getTwoTreeParaListiev() {
        return twoTreeParaListiev;
    }

    public void setTwoTreeParaListiev(double twoTreeParaListiev) {
        this.twoTreeParaListiev = twoTreeParaListiev;
    }

    public double getFourFiveParaListiev() {
        return fourFiveParaListiev;
    }

    public void setFourFiveParaListiev(double fourFiveParaListiev) {
        this.fourFiveParaListiev = fourFiveParaListiev;
    }

    public double getSmikanieRiadov() {
        return smikanieRiadov;
    }

    public void setSmikanieRiadov(double smikanieRiadov) {
        this.smikanieRiadov = smikanieRiadov;
    }

    public double getSmikanieMejdyRiadov() {
        return smikanieMejdyRiadov;
    }

    public void setSmikanieMejdyRiadov(double smikanieMejdyRiadov) {
        this.smikanieMejdyRiadov = smikanieMejdyRiadov;
    }

    public double getNalivCorneploda() {
        return nalivCorneploda;
    }

    public void setNalivCorneploda(double nalivCorneploda) {
        this.nalivCorneploda = nalivCorneploda;
    }

    public int getKushenieImg() {
        return kushenieImg;
    }

    public void setKushenieImg(int kushenieImg) {
        this.kushenieImg = kushenieImg;
    }

    public int getTwoTreeParaListievImg() {
        return twoTreeParaListievImg;
    }

    public void setTwoTreeParaListievImg(int twoTreeParaListievImg) {
        this.twoTreeParaListievImg = twoTreeParaListievImg;
    }

    public int getFourFiveParaListievImg() {
        return fourFiveParaListievImg;
    }

    public void setFourFiveParaListievImg(int fourFiveParaListievImg) {
        this.fourFiveParaListievImg = fourFiveParaListievImg;
    }

    public int getSmikanieRiadovImg() {
        return smikanieRiadovImg;
    }

    public void setSmikanieRiadovImg(int smikanieRiadovImg) {
        this.smikanieRiadovImg = smikanieRiadovImg;
    }

    public int getSmikanieMejdyRiadovImg() {
        return smikanieMejdyRiadovImg;
    }

    public void setSmikanieMejdyRiadovImg(int smikanieMejdyRiadovImg) {
        this.smikanieMejdyRiadovImg = smikanieMejdyRiadovImg;
    }

    public int getNalivCorneplodaImg() {
        return nalivCorneplodaImg;
    }

    public void setNalivCorneplodaImg(int nalivCorneplodaImg) {
        this.nalivCorneplodaImg = nalivCorneplodaImg;
    }
}
