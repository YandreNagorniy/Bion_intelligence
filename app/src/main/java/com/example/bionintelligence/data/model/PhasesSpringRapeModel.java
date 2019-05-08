package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PhasesSpringRapeModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double steblevanie;
    private double butonizacia;
    private double polnoeCvetenie;

    public PhasesSpringRapeModel(int productive, double steblevanie, double butonizacia, double polnoeCvetenie) {
        this.productive = productive;
        this.steblevanie = steblevanie;
        this.butonizacia = butonizacia;
        this.polnoeCvetenie = polnoeCvetenie;
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

    public double getSteblevanie() {
        return steblevanie;
    }

    public void setSteblevanie(double steblevanie) {
        this.steblevanie = steblevanie;
    }

    public double getButonizacia() {
        return butonizacia;
    }

    public void setButonizacia(double butonizacia) {
        this.butonizacia = butonizacia;
    }

    public double getPolnoeCvetenie() {
        return polnoeCvetenie;
    }

    public void setPolnoeCvetenie(double polnoeCvetenie) {
        this.polnoeCvetenie = polnoeCvetenie;
    }

}
