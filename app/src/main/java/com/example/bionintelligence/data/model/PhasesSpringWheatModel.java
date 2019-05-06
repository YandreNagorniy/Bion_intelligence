package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PhasesSpringWheatModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double kushenie;
    private double trubkovanie;
    private double koloshenie;
    private double naliv;

    private int kushenieImg;
    private int trubkovanieImg;
    private int koloshenieImg;
    private int nalivImg;

    public PhasesSpringWheatModel(int productive, double kushenie, double trubkovanie, double koloshenie,
                                  double naliv, int kushenieImg, int trubkovanieImg, int koloshenieImg, int nalivImg) {
        this.productive = productive;
        this.kushenie = kushenie;
        this.trubkovanie = trubkovanie;
        this.koloshenie = koloshenie;
        this.naliv = naliv;
        this.kushenieImg = kushenieImg;
        this.trubkovanieImg = trubkovanieImg;
        this.koloshenieImg = koloshenieImg;
        this.nalivImg = nalivImg;
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

    public int getKushenieImg() {
        return kushenieImg;
    }

    public void setKushenieImg(int kushenieImg) {
        this.kushenieImg = kushenieImg;
    }

    public int getTrubkovanieImg() {
        return trubkovanieImg;
    }

    public void setTrubkovanieImg(int trubkovanieImg) {
        this.trubkovanieImg = trubkovanieImg;
    }

    public int getKoloshenieImg() {
        return koloshenieImg;
    }

    public void setKoloshenieImg(int koloshenieImg) {
        this.koloshenieImg = koloshenieImg;
    }

    public int getNalivImg() {
        return nalivImg;
    }

    public void setNalivImg(int nalivImg) {
        this.nalivImg = nalivImg;
    }
}
