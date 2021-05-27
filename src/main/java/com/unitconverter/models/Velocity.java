package com.unitconverter.models;

import lombok.Getter;
import lombok.Setter;


public class Velocity {

    private double kilometersPerHour;
    private double milesPerHours;
    private double kilometersPerSecond;
    private double milesPerSecond;
    private double metersPerSecond;
    private double footPerSecond;

    public Velocity() {
    }

    public double getKilometersPerHour() {
        return kilometersPerHour;
    }

    public void setKilometersPerHour(double kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

    public double getMilesPerHours() {
        return milesPerHours;
    }

    public void setMilesPerHours(double milesPerHours) {
        this.milesPerHours = milesPerHours;
    }

    public double getKilometersPerSecond() {
        return kilometersPerSecond;
    }

    public void setKilometersPerSecond(double kilometersPerSecond) {
        this.kilometersPerSecond = kilometersPerSecond;
    }

    public double getMilesPerSecond() {
        return milesPerSecond;
    }

    public void setMilesPerSecond(double milesPerSecond) {
        this.milesPerSecond = milesPerSecond;
    }

    public double getMeterPerSecond() {
        return metersPerSecond;
    }

    public void setMeterPerSecond(double meterPerSecond) {
        this.metersPerSecond = meterPerSecond;
    }

    public double getFootPerSecond() {
        return footPerSecond;
    }

    public void setFootPerSecond(double footPerSecond) {
        this.footPerSecond = footPerSecond;
    }
}
