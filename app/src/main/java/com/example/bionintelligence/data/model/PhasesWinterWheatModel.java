package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PhasesWinterWheatModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double kushenie;
    private double trubkovanie;
    private double koloshenie;
    private double naliv;

    public PhasesWinterWheatModel(int productive, double kushenie, double trubkovanie, double koloshenie, double naliv) {
        this.productive = productive;
        this.kushenie = kushenie;
        this.trubkovanie = trubkovanie;
        this.koloshenie = koloshenie;
        this.naliv = naliv;
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
