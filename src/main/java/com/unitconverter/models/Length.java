package com.unitconverter.models;

import lombok.Getter;
import lombok.Setter;


public class Length {

    private Double kilometer;
    private Double meter;
    private Double decimeter;
    private Double centimeter;
    private Double millimeter;
    private Double mile;
    private Double yard;
    private Double foot;
    private Double inch;

    public Length() {
    }

    public Double getKilometer() {
        return kilometer;
    }

    public void setKilometer(Double kilometer) {
        this.kilometer = kilometer;
    }

    public Double getMeter() {
        return meter;
    }

    public void setMeter(Double meter) {
        this.meter = meter;
    }

    public Double getDecimeter() {
        return decimeter;
    }

    public void setDecimeter(Double decimeter) {
        this.decimeter = decimeter;
    }

    public Double getCentimeter() {
        return centimeter;
    }

    public void setCentimeter(Double centimeter) {
        this.centimeter = centimeter;
    }

    public Double getMillimeter() {
        return millimeter;
    }

    public void setMillimeter(Double millimeter) {
        this.millimeter = millimeter;
    }

    public Double getMile() {
        return mile;
    }

    public void setMile(Double mile) {
        this.mile = mile;
    }

    public Double getYard() {
        return yard;
    }

    public void setYard(Double yard) {
        this.yard = yard;
    }

    public Double getFoot() {
        return foot;
    }

    public void setFoot(Double foot) {
        this.foot = foot;
    }

    public Double getInch() {
        return inch;
    }

    public void setInch(Double inch) {
        this.inch = inch;
    }
}
