package com.example.bionintelligence.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = CultureModel.class, parentColumns = "id", childColumns = "cultureId",onDelete = CASCADE))
public class PhasesSugarBeetModel {
    @ColumnInfo(index = true)
    private int cultureId;
    private int productive;
    private double kushenie;
    private double twoTreeParaListiev;
    private double fourFiveParaListiev;
    private double smikanieRiadov;
    private double smikanieMejdyRiadov;
    private double nalivCorneploda;

    public PhasesSugarBeetModel(int cultureId, int productive, double kushenie, double twoTreeParaListiev,
                                double fourFiveParaListiev, double smikanieRiadov, double smikanieMejdyRiadov, double nalivCorneploda) {
        this.cultureId = cultureId;
        this.productive = productive;
        this.kushenie = kushenie;
        this.twoTreeParaListiev = twoTreeParaListiev;
        this.fourFiveParaListiev = fourFiveParaListiev;
        this.smikanieRiadov = smikanieRiadov;
        this.smikanieMejdyRiadov = smikanieMejdyRiadov;
        this.nalivCorneploda = nalivCorneploda;
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

    public double getKushenie() {
        return kushenie;
    }

    public void setKushenie(double kushenie) {
        this.kushenie = kushenie;
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
}
