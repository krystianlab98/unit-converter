package com.unitconverter.models;

import lombok.Getter;
import lombok.Setter;


public class Time {

    private double nanosecond;
    private double microsecond;
    private double millisecond;
    private double second;
    private double minute;
    private double hour;


    public Time() {
    }

    public double getNanosecond() {
        return nanosecond;
    }

    public void setNanosecond(double nanosecond) {
        this.nanosecond = nanosecond;
    }

    public double getMicrosecond() {
        return microsecond;
    }

    public void setMicrosecond(double microsecond) {
        this.microsecond = microsecond;
    }

    public double getMillisecond() {
        return millisecond;
    }

    public void setMillisecond(double millisecond) {
        this.millisecond = millisecond;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }
}
