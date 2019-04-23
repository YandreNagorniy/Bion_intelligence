package com.example.bionintelligence.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = CultureModel.class, parentColumns = "id", childColumns = "cultureId",onDelete = CASCADE))
public class PhasesSpringWheatModel {
    @ColumnInfo(index = true)
    private int cultureId;
    private int productive;
    private double kushenie;
    private double trubkovanie;
    private double koloshenie;
    private double naliv;

    public PhasesSpringWheatModel(int cultureId, int productive, double kushenie, double trubkovanie, double koloshenie, double naliv) {
        this.cultureId = cultureId;
        this.productive = productive;
        this.kushenie = kushenie;
        this.trubkovanie = trubkovanie;
        this.koloshenie = koloshenie;
        this.naliv = naliv;
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

    public double getTrubkovanie() {
        return trubkovanie;
    }

    public void setTrubkovanie(double trubkovanie) {
        this.trubkovanie = trubkovanie;
    }

    public double getKoloshenie() {
        return koloshenie;
    }

    public void setKoloshenie(double koloshenie) {
        this.koloshenie = koloshenie;
    }

    public double getNaliv() {
        return naliv;
    }

    public void setNaliv(double naliv) {
        this.naliv = naliv;
    }
}
