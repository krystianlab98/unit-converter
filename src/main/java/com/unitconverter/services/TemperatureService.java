package com.unitconverter.services;

import com.unitconverter.models.Temperature;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public ResponseEntity<?> convertTemperature(String unit){
        return convertTemperature(unit, 1.0);
    }


    public ResponseEntity<?> convertTemperature(String unit, Double amount) {
        switch (unit) {
            case "fahrenheit": return new ResponseEntity<>(convertFahrenheit(amount), HttpStatus.OK);
            case "celsius": return new ResponseEntity<>(convertCelsius(amount), HttpStatus.OK);
            case "kelvin": return new ResponseEntity<>(convertKelvin(amount), HttpStatus.OK);
            default:return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting the resource.");
        }
    }

    public Temperature convertFahrenheit(Double amount) {
        Temperature temperature = new Temperature();
        temperature.setFahrenheit(amount);
        temperature.setCelsius((amount-32)/1.8000);
        temperature.setKelvin((amount-32)/1.8000+273.15);
        return temperature;
    }

    public Temperature convertCelsius(Double amount) {
        Temperature temperature = new Temperature();
        temperature.setFahrenheit(amount*1.8000+32);
        temperature.setCelsius(amount);
        temperature.setKelvin(amount+273.15);
        return temperature;
    }

    public Temperature convertKelvin(Double amount) {
        Temperature temperature = new Temperature();
        temperature.setFahrenheit((amount-273.15)*1.8000+32);
        temperature.setCelsius(amount-273.15);
        temperature.setKelvin(amount);
        return temperature;
    }
}
