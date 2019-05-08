package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

//Озимый рапс
@Entity
public class PhasesWinterRapeModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double startSteblevanie;
    private double butonizacia;
    private double startCvetenie;
    private double naliv;

    public PhasesWinterRapeModel(int productive, double startSteblevanie, double butonizacia, double startCvetenie, double naliv) {
        this.productive = productive;
        this.startSteblevanie = startSteblevanie;
        this.butonizacia = butonizacia;
        this.startCvetenie = startCvetenie;
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

    public double getStartSteblevanie() {
        return startSteblevanie;
    }

    public void setStartSteblevanie(double startSteblevanie) {
        this.startSteblevanie = startSteblevanie;
    }

    public double getButonizacia() {
        return butonizacia;
    }

    public void setButonizacia(double butonizacia) {
        this.butonizacia = butonizacia;
    }

    public double getStartCvetenie() {
        return startCvetenie;
    }

    public void setStartCvetenie(double startCvetenie) {
        this.startCvetenie = startCvetenie;
    }

    public double getNaliv() {
        return naliv;
    }

    public void setNaliv(double naliv) {
        this.naliv = naliv;
    }

}
