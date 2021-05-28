package com.unitconverter;


import com.unitconverter.models.Length;
import com.unitconverter.services.LengthService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestLength {

    LengthService lengthService;

    private double kilometer, meter, decimeter, centimeter, millimeter, mile, yard, foot, inch;
    private double expectedKilometer, expectedMeter, expectedDecimeter,
            expectedCentimeter, expectedMillimeter, expectedMile, expectedYard, expectedFoot, expectedInch;

    @Autowired
    public TestLength(LengthService lengthService) {
        this.lengthService = lengthService;
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testConvertDefaultUnit(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("kilometer");

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 1.0;
        expectedMeter = 1000.0;
        expectedDecimeter = 10000.0;
        expectedCentimeter =100000.0;
        expectedMillimeter = 1000000.0;
        expectedMile = 0.62137119224;
        expectedYard =1093.613;
        expectedFoot = 3280.84;
        expectedInch = 39370.079;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testConvertKilometers(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("kilometer", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 1.0;
        expectedMeter = 1000.0;
        expectedDecimeter = 10000.0;
        expectedCentimeter =100000.0;
        expectedMillimeter = 1000000.0;
        expectedMile = 0.62137119224;
        expectedYard =1093.613;
        expectedFoot = 3280.84;
        expectedInch = 39370.079;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testConvertMeters(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("meter", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 0.001;
        expectedMeter = 1.0;
        expectedDecimeter = 10.0;
        expectedCentimeter = 100.0;
        expectedMillimeter = 1000.0;
        expectedMile = 0.00062137119;
        expectedYard = 1.094;
        expectedFoot = 3.281;
        expectedInch = 39.37;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertDecimeters(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("decimeter", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 0.0001;
        expectedMeter = 0.1;
        expectedDecimeter = 1.0;
        expectedCentimeter = 10.0;
        expectedMillimeter = 100.0;
        expectedMile = 0.0062137119;
        expectedYard = 0.1094;
        expectedFoot = 0.3281;
        expectedInch = 3.937;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertCentimeters(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("centimeter", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 0.00001;
        expectedMeter = 0.01;
        expectedDecimeter = 0.1;
        expectedCentimeter = 1.0;
        expectedMillimeter = 10.0;
        expectedMile = 0.0000062137119;
        expectedYard = 0.01093613298;
        expectedFoot = 0.03280839895;
        expectedInch = 0.3937007874;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertMillimeters(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("millimeter", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 0.000001;
        expectedMeter = 0.001;
        expectedDecimeter = 0.01;
        expectedCentimeter = 0.1;
        expectedMillimeter = 1.0;
        expectedMile = 6.2137119e-7;
        expectedYard = 0.0010936133;
        expectedFoot = 0.0032808399;
        expectedInch = 0.03937007874;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testConvertMile(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("mile", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 1.609;
        expectedMeter = 1609.344;
        expectedDecimeter = 16093.44;
        expectedCentimeter = 160934.4;
        expectedMillimeter = 1609000.0;
        expectedMile = 1;
        expectedYard = 1760.0;
        expectedFoot = 5280.0;
        expectedInch =63360.0;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertYard(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("yard", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 0.0009144;
        expectedMeter = 0.9144;
        expectedDecimeter = 9.144;
        expectedCentimeter = 91.44;
        expectedMillimeter = 914.4;
        expectedMile = 0.00056818182;
        expectedYard =1.0;
        expectedFoot = 3.0;
        expectedInch = 36.0;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertFoot(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("foot", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 0.0003048;
        expectedMeter = 0.3048;
        expectedDecimeter = 3.048;
        expectedCentimeter = 30.48;
        expectedMillimeter = 304.8;
        expectedMile = 0.00018939394;
        expectedYard = 0.333333;
        expectedFoot = 1.0;
        expectedInch = 12.0;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertInch(){
        ResponseEntity<Length> length = (ResponseEntity<Length>) lengthService.convertLength("inch", 1.0);

        kilometer = length.getBody().getKilometer();
        meter = length.getBody().getMeter();
        decimeter = length.getBody().getDecimeter();
        centimeter = length.getBody().getCentimeter();
        millimeter = length.getBody().getMillimeter();
        mile = length.getBody().getMile();
        yard = length.getBody().getYard();
        foot = length.getBody().getFoot();
        inch = length.getBody().getInch();

        expectedKilometer = 0.0000254;
        expectedMeter = 0.0254;
        expectedDecimeter = 0.254;
        expectedCentimeter = 2.54;
        expectedMillimeter = 25.4;
        expectedMile = 0.000015782828;
        expectedYard = 0.02777777778;
        expectedFoot = 0.0833333;
        expectedInch = 1.0;

        assertEquals(expectedKilometer, kilometer);
        assertEquals(expectedMeter, meter);
        assertEquals(expectedDecimeter, decimeter);
        assertEquals(expectedCentimeter, centimeter);
        assertEquals(expectedMillimeter, millimeter);
        assertEquals(expectedMile, mile);
        assertEquals(expectedYard, yard);
        assertEquals(expectedFoot, foot);
        assertEquals(expectedInch, inch);

    }

}
