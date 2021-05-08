package com.unitconverter.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
