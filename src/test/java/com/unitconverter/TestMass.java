package com.unitconverter;


import com.unitconverter.models.Mass;
import com.unitconverter.services.MassService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestMass {

    @Autowired
    MassService massService;

    private double milligram, gram, decagram, kilogram, ton, ounce, pound;
    private double expectedMilligram, expectedGram, expectedDecagram, expectedKilogram, expectedTon, expectedOunce, expectedPound;


    @Test
    @SuppressWarnings("unchecked")
    public void testConvertDefaultUnit(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("kilogram");

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedMilligram = 1000000.0;
        expectedGram= 1000.0;
        expectedDecagram = 100.0;
        expectedKilogram = 1.0;
        expectedTon = 0.001;
        expectedOunce = 35.274;
        expectedPound = 2.2046;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertKilogram(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("kilogram", 1.0);

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedMilligram = 1000000.0;
        expectedGram= 1000.0;
        expectedDecagram = 100.0;
        expectedKilogram = 1.0;
        expectedTon = 0.001;
        expectedOunce = 35.274;
        expectedPound = 2.2046;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConverDecagram(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("decagram", 1.0);

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedKilogram = 0.1;
        expectedDecagram = 1.0;
        expectedGram= 10.0;
        expectedMilligram = 10000.0;
        expectedTon = 0.00001;
        expectedOunce = 0.3527;
        expectedPound = 0.022;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertGram(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("gram", 1.0);

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedKilogram = 0.001;
        expectedDecagram = 0.1;
        expectedGram= 1.0;
        expectedMilligram = 1000.0;
        expectedTon = 0.000001;
        expectedOunce = 0.0353;
        expectedPound = 0.0022;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertMilligram(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("milligram", 1.0);

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedKilogram = 0.000001;
        expectedDecagram = 0.0001;
        expectedGram= 0.001;
        expectedMilligram = 1.0;
        expectedTon = 1e-9;
        expectedOunce = 0.000035274;
        expectedPound = 0.0000022046;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertTon(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("ton", 1.0);

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedKilogram = 1000.0;
        expectedDecagram = 100000.0;
        expectedGram= 1000000.0;
        expectedMilligram = 1000000000.0;
        expectedTon = 1.0;
        expectedOunce = 35273.9621;
        expectedPound = 2204.6226;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertOunce(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("ounce", 1.0);

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedKilogram = 0.0283;
        expectedDecagram = 2.835;
        expectedGram= 28.3495;
        expectedMilligram = 28349.523;
        expectedTon = 0.000022835;
        expectedOunce = 1.0;
        expectedPound = 0.0625;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testConvertPound(){
        ResponseEntity<Mass> mass = (ResponseEntity<Mass>) massService.convertMass("pound", 1.0);

        kilogram = mass.getBody().getKilogram();
        decagram = mass.getBody().getDecagram();
        gram = mass.getBody().getGram();
        milligram = mass.getBody().getMilligram();
        ton = mass.getBody().getTon();
        ounce = mass.getBody().getOunce();
        pound = mass.getBody().getPound();


        expectedKilogram = 0.4536;
        expectedDecagram = 45.3592;
        expectedGram= 453.5924;
        expectedMilligram = 453590.0;
        expectedTon = 0.0005;
        expectedOunce = 16.0;
        expectedPound = 1.0;

        assertEquals(expectedMilligram, milligram);
        assertEquals(expectedGram, gram);
        assertEquals(expectedDecagram, decagram);
        assertEquals(expectedKilogram, kilogram);
        assertEquals(expectedTon, ton);
        assertEquals(expectedOunce, ounce);
        assertEquals(expectedPound, pound);
    }
}
