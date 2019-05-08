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


    public PhasesSugarBeetModel(int productive, double twoTreeParaListiev, double fourFiveParaListiev,
                                double smikanieRiadov, double smikanieMejdyRiadov, double nalivCorneploda) {
        this.productive = productive;
        this.twoTreeParaListiev = twoTreeParaListiev;
        this.fourFiveParaListiev = fourFiveParaListiev;
        this.smikanieRiadov = smikanieRiadov;
        this.smikanieMejdyRiadov = smikanieMejdyRiadov;
        this.nalivCorneploda = nalivCorneploda;
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
}
