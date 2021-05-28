package com.unitconverter;

import com.unitconverter.models.Temperature;
import com.unitconverter.services.TemperatureService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestTemperature {

    private TemperatureService temperatureService;
    private double fahrenheit, celsius, kelvin;
    private double expectedFahrenheit, expectedCelsius, expectedKelvin;

    @Autowired
    public TestTemperature(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDefaultTemperatureUnit(){
        ResponseEntity<Temperature> temperature = (ResponseEntity<Temperature>) temperatureService.convertTemperature("celsius");

        fahrenheit = temperature.getBody().getFahrenheit();
        celsius = temperature.getBody().getCelsius();
        kelvin = temperature.getBody().getKelvin();

        expectedCelsius = 1.0;
        expectedFahrenheit = 33.8;
        expectedKelvin = 274.15;

        assertEquals(expectedFahrenheit, fahrenheit);
        assertEquals(expectedCelsius, celsius);
        assertEquals(expectedKelvin, kelvin);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testCelsius(){
        ResponseEntity<Temperature> temperature = (ResponseEntity<Temperature>) temperatureService.convertTemperature("celsius", 1.0);

        fahrenheit = temperature.getBody().getFahrenheit();
        celsius = temperature.getBody().getCelsius();
        kelvin = temperature.getBody().getKelvin();

        expectedCelsius = 1.0;
        expectedFahrenheit = 33.8;
        expectedKelvin = 274.15;

        assertEquals(expectedFahrenheit, fahrenheit);
        assertEquals(expectedCelsius, celsius);
        assertEquals(expectedKelvin, kelvin);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testFahrenheit(){
        ResponseEntity<Temperature> temperature = (ResponseEntity<Temperature>) temperatureService.convertTemperature("fahrenheit", 1.0);

        fahrenheit = temperature.getBody().getFahrenheit();
        celsius = temperature.getBody().getCelsius();
        kelvin = temperature.getBody().getKelvin();

        expectedCelsius = -17.22222222222222;
        expectedFahrenheit = 1.0;
        expectedKelvin = 255.92777777777775;

        assertEquals(expectedFahrenheit, fahrenheit);
        assertEquals(expectedCelsius, celsius);
        assertEquals(expectedKelvin, kelvin);
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testKelvin(){
        ResponseEntity<Temperature> temperature = (ResponseEntity<Temperature>) temperatureService.convertTemperature("kelvin", 1.0);

        fahrenheit = temperature.getBody().getFahrenheit();
        celsius = temperature.getBody().getCelsius();
        kelvin = temperature.getBody().getKelvin();

        expectedCelsius = -272.15;
        expectedFahrenheit = -457.86999999999995;
        expectedKelvin = 1.0;

        assertEquals(expectedFahrenheit, fahrenheit);
        assertEquals(expectedCelsius, celsius);
        assertEquals(expectedKelvin, kelvin);
    }

}
