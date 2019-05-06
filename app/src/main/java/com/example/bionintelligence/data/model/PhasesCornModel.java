package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PhasesCornModel {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double twoThreeListiev;
    private double fiveSixListiev;
    private double sevenEightListiev;

    private int twoThreeListievImg;
    private int fiveSixListievImg;
    private int sevenEightListievImg;

    public PhasesCornModel(int productive, double twoThreeListiev, double fiveSixListiev,
                           double sevenEightListiev, int twoThreeListievImg, int fiveSixListievImg, int sevenEightListievImg) {
        this.productive = productive;
        this.twoThreeListiev = twoThreeListiev;
        this.fiveSixListiev = fiveSixListiev;
        this.sevenEightListiev = sevenEightListiev;
        this.twoThreeListievImg = twoThreeListievImg;
        this.fiveSixListievImg = fiveSixListievImg;
        this.sevenEightListievImg = sevenEightListievImg;
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

    public double getTwoThreeListiev() {
        return twoThreeListiev;
    }

    public void setTwoThreeListiev(double twoThreeListiev) {
        this.twoThreeListiev = twoThreeListiev;
    }

    public double getFiveSixListiev() {
        return fiveSixListiev;
    }

    public void setFiveSixListiev(double fiveSixListiev) {
        this.fiveSixListiev = fiveSixListiev;
    }

    public double getSevenEightListiev() {
        return sevenEightListiev;
    }

    public void setSevenEightListiev(double sevenEightListiev) {
        this.sevenEightListiev = sevenEightListiev;
    }

    public int getTwoThreeListievImg() {
        return twoThreeListievImg;
    }

    public void setTwoThreeListievImg(int twoThreeListievImg) {
        this.twoThreeListievImg = twoThreeListievImg;
    }

    public int getFiveSixListievImg() {
        return fiveSixListievImg;
    }

    public void setFiveSixListievImg(int fiveSixListievImg) {
        this.fiveSixListievImg = fiveSixListievImg;
    }

    public int getSevenEightListievImg() {
        return sevenEightListievImg;
    }

    public void setSevenEightListievImg(int sevenEightListievImg) {
        this.sevenEightListievImg = sevenEightListievImg;
    }
}
