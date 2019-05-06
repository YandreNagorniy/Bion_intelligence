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

    private int twoFourListievImg;
    private int eightTenSheetsImg;
    private int closeSocvetieImg;

    public PhasesSunFlowerModel(int productive, double twoFourListiev, double eightTenSheets,
                                double closeSocvetie, int twoFourListievImg, int eightTenSheetsImg, int closeSocvetieImg) {
        this.productive = productive;
        this.twoFourListiev = twoFourListiev;
        this.eightTenSheets = eightTenSheets;
        this.closeSocvetie = closeSocvetie;
        this.twoFourListievImg = twoFourListievImg;
        this.eightTenSheetsImg = eightTenSheetsImg;
        this.closeSocvetieImg = closeSocvetieImg;
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

    public int getTwoFourListievImg() {
        return twoFourListievImg;
    }

    public void setTwoFourListievImg(int twoFourListievImg) {
        this.twoFourListievImg = twoFourListievImg;
    }

    public int getEightTenSheetsImg() {
        return eightTenSheetsImg;
    }

    public void setEightTenSheetsImg(int eightTenSheetsImg) {
        this.eightTenSheetsImg = eightTenSheetsImg;
    }

    public int getCloseSocvetieImg() {
        return closeSocvetieImg;
    }

    public void setCloseSocvetieImg(int closeSocvetieImg) {
        this.closeSocvetieImg = closeSocvetieImg;
    }
}
