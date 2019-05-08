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

    public PhasesCornModel(int productive, double twoThreeListiev, double fiveSixListiev,
                           double sevenEightListiev) {
        this.productive = productive;
        this.twoThreeListiev = twoThreeListiev;
        this.fiveSixListiev = fiveSixListiev;
        this.sevenEightListiev = sevenEightListiev;

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
}
