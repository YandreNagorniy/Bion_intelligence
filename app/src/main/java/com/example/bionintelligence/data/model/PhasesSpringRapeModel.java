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

    private int steblevanieImg;
    private int butonizaciaImg;
    private int polnoeCvetenieImg;

    public PhasesSpringRapeModel(int productive, double steblevanie, double butonizacia, double polnoeCvetenie,
                                 int steblevanieImg, int butonizaciaImg, int polnoeCvetenieImg) {
        this.productive = productive;
        this.steblevanie = steblevanie;
        this.butonizacia = butonizacia;
        this.polnoeCvetenie = polnoeCvetenie;
        this.steblevanieImg = steblevanieImg;
        this.butonizaciaImg = butonizaciaImg;
        this.polnoeCvetenieImg = polnoeCvetenieImg;
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

    public int getSteblevanieImg() {
        return steblevanieImg;
    }

    public void setSteblevanieImg(int steblevanieImg) {
        this.steblevanieImg = steblevanieImg;
    }

    public int getButonizaciaImg() {
        return butonizaciaImg;
    }

    public void setButonizaciaImg(int butonizaciaImg) {
        this.butonizaciaImg = butonizaciaImg;
    }

    public int getPolnoeCvetenieImg() {
        return polnoeCvetenieImg;
    }

    public void setPolnoeCvetenieImg(int polnoeCvetenieImg) {
        this.polnoeCvetenieImg = polnoeCvetenieImg;
    }
}
