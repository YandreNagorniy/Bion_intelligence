package com.example.bionintelligence.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PhasesPotatoesModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int productive;
    private double vshodi;
    private double rostListiev;
    private double smikanieRiadov;
    private double butonizacia;
    private double cvetenie;
    private double nalivClybnia;

    private int vshodiImg;
    private int rostListievImg;
    private int smikanieRiadovImg;
    private int butonizaciaImg;
    private int cvetenieImg;
    private int nalivClybniaImg;

    public PhasesPotatoesModel(int productive, double vshodi, double rostListiev, double smikanieRiadov,
                               double butonizacia, double cvetenie, double nalivClybnia, int vshodiImg,
                               int rostListievImg, int smikanieRiadovImg, int butonizaciaImg, int cvetenieImg, int nalivClybniaImg) {
        this.productive = productive;
        this.vshodi = vshodi;
        this.rostListiev = rostListiev;
        this.smikanieRiadov = smikanieRiadov;
        this.butonizacia = butonizacia;
        this.cvetenie = cvetenie;
        this.nalivClybnia = nalivClybnia;
        this.vshodiImg = vshodiImg;
        this.rostListievImg = rostListievImg;
        this.smikanieRiadovImg = smikanieRiadovImg;
        this.butonizaciaImg = butonizaciaImg;
        this.cvetenieImg = cvetenieImg;
        this.nalivClybniaImg = nalivClybniaImg;
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

    public double getVshodi() {
        return vshodi;
    }

    public void setVshodi(double vshodi) {
        this.vshodi = vshodi;
    }

    public double getRostListiev() {
        return rostListiev;
    }

    public void setRostListiev(double rostListiev) {
        this.rostListiev = rostListiev;
    }

    public double getSmikanieRiadov() {
        return smikanieRiadov;
    }

    public void setSmikanieRiadov(double smikanieRiadov) {
        this.smikanieRiadov = smikanieRiadov;
    }

    public double getButonizacia() {
        return butonizacia;
    }

    public void setButonizacia(double butonizacia) {
        this.butonizacia = butonizacia;
    }

    public double getCvetenie() {
        return cvetenie;
    }

    public void setCvetenie(double cvetenie) {
        this.cvetenie = cvetenie;
    }

    public double getNalivClybnia() {
        return nalivClybnia;
    }

    public void setNalivClybnia(double nalivClybnia) {
        this.nalivClybnia = nalivClybnia;
    }

    public int getVshodiImg() {
        return vshodiImg;
    }

    public void setVshodiImg(int vshodiImg) {
        this.vshodiImg = vshodiImg;
    }

    public int getRostListievImg() {
        return rostListievImg;
    }

    public void setRostListievImg(int rostListievImg) {
        this.rostListievImg = rostListievImg;
    }

    public int getSmikanieRiadovImg() {
        return smikanieRiadovImg;
    }

    public void setSmikanieRiadovImg(int smikanieRiadovImg) {
        this.smikanieRiadovImg = smikanieRiadovImg;
    }

    public int getButonizaciaImg() {
        return butonizaciaImg;
    }

    public void setButonizaciaImg(int butonizaciaImg) {
        this.butonizaciaImg = butonizaciaImg;
    }

    public int getCvetenieImg() {
        return cvetenieImg;
    }

    public void setCvetenieImg(int cvetenieImg) {
        this.cvetenieImg = cvetenieImg;
    }

    public int getNalivClybniaImg() {
        return nalivClybniaImg;
    }

    public void setNalivClybniaImg(int nalivClybniaImg) {
        this.nalivClybniaImg = nalivClybniaImg;
    }
}
