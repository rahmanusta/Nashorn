package com.kodcu.geo;

/**
 * Created by usta on 13.01.2014.
 */
public class Geo {

    private double en;
    private double boy;

    public Geo() {
    }

    public Geo(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double hesapla() {
        return en * boy;
    }
}
