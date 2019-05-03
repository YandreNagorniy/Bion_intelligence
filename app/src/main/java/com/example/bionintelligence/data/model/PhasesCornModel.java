package com.example.bionintelligence.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = CultureModel.class, parentColumns = "id", childColumns = "cultureId", onDelete = CASCADE))
public class PhasesCornModel {
    @ColumnInfo(index = true)
    private int cultureId;
    private int productive;
    private double twoThreeListiev;
    private double fiveSixListiev;
    private double sevenEightListiev;
    private int imgLink;

    public PhasesCornModel(int cultureId, int productive, double twoThreeListiev, double fiveSixListiev, double sevenEightListiev, int imgLink) {
        this.cultureId = cultureId;
        this.productive = productive;
        this.twoThreeListiev = twoThreeListiev;
        this.fiveSixListiev = fiveSixListiev;
        this.sevenEightListiev = sevenEightListiev;
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

    public int getImgLink() {
        return imgLink;
    }

    public void setImgLink(int imgLink) {
        this.imgLink = imgLink;
    }
}
