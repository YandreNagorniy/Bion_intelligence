package com.example.bionintelligence.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

//подсолечник
@Entity(foreignKeys = @ForeignKey(entity = CultureModel.class, parentColumns = "id", childColumns = "cultureId",onDelete = CASCADE))
public class PhasesSunFlowerModel {
    @ColumnInfo(index = true)
    private int cultureId;
    private int productive;
    private double twoFourListiev;
    private double eightTenSheets;
    private double closeSocvetie;
    private int imgLink;

    public PhasesSunFlowerModel(int cultureId, int productive, double twoFourListiev, double eightTenSheets, double closeSocvetie, int imgLink) {
        this.cultureId = cultureId;
        this.productive = productive;
        this.twoFourListiev = twoFourListiev;
        this.eightTenSheets = eightTenSheets;
        this.closeSocvetie = closeSocvetie;
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

    public int getImgLink() {
        return imgLink;
    }

    public void setImgLink(int imgLink) {
        this.imgLink = imgLink;
    }
}
