package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

//подсолечник
@Entity
public class PhasesSunFlowerModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double twoFourListiev;
    private double eightTenSheets;
    private double closeSocvetie;

    public PhasesSunFlowerModel(int productive, double twoFourListiev, double eightTenSheets, double closeSocvetie) {
        this.productive = productive;
        this.twoFourListiev = twoFourListiev;
        this.eightTenSheets = eightTenSheets;
        this.closeSocvetie = closeSocvetie;
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

    public double getTwoFourListiev() {
        return twoFourListiev;
    }

    public void setTwoFourListiev(double twoFourListiev) {
        this.twoFourListiev = twoFourListiev;
    }

    public double getEightTenSheets() {
        return eightTenSheets;
    }

    public void setEightTenSheets(double eightTenSheets) {
        this.eightTenSheets = eightTenSheets;
    }

    public double getCloseSocvetie() {
        return closeSocvetie;
    }

    public void setCloseSocvetie(double closeSocvetie) {
        this.closeSocvetie = closeSocvetie;
    }
}
