package com.example.bionintelligence.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = CultureModel.class, parentColumns = "id", childColumns = "cultureId",onDelete = CASCADE))
public class PhasesPotatoesModel {
    @ColumnInfo(index = true)
    private int cultureId;
    private int productive;
    private double vshodi;
    private double rostListiev;
    private double smikanieRiadov;
    private double butonizacia;
    private double cvetenie;
    private double nalivClybnia;

    public PhasesPotatoesModel(int cultureId, int productive, double vshodi, double rostListiev, double smikanieRiadov, double butonizacia, double cvetenie, double nalivClybnia) {
        this.cultureId = cultureId;
        this.productive = productive;
        this.vshodi = vshodi;
        this.rostListiev = rostListiev;
        this.smikanieRiadov = smikanieRiadov;
        this.butonizacia = butonizacia;
        this.cvetenie = cvetenie;
        this.nalivClybnia = nalivClybnia;
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
}
