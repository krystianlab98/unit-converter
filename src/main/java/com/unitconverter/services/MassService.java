package com.unitconverter.services;

import com.unitconverter.models.Mass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MassService {


    public ResponseEntity<?> convertMass(String unit){
        return convertMass(unit, 1.0);
    }

    public ResponseEntity<?> convertMass(String unit, Double amount){
        switch (unit){
            case "milligram" : return new ResponseEntity<>(convertMilligram(amount), HttpStatus.OK);
            case "gram" : return new ResponseEntity<>(convertGram(amount), HttpStatus.OK);
            case "decagram" : return new ResponseEntity<>(convertDecagram(amount), HttpStatus.OK);
            case "kilogram" : return new ResponseEntity<>(convertKilogram(amount), HttpStatus.OK);
            case "ton" : return new ResponseEntity<>(convertTone(amount), HttpStatus.OK);
            case "ounce" : return new ResponseEntity<>(convertOunce(amount), HttpStatus.OK);
            case "pound" : return new ResponseEntity<>(convertPound(amount), HttpStatus.OK);
            default:return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting Time resource.");
        }
    }

    private Mass convertMilligram(Double amount){
        Mass mass = new Mass();
        mass.setMilligram(amount);
        mass.setGram(amount * 0.001);
        mass.setDecagram(amount * 1.0e-4);
        mass.setKilogram(amount * 1.0e-6);
        mass.setTon(amount * 1.0e-9);
        mass.setOunce(amount * 3.5274e-5);
        mass.setPound(amount * 2.2046-6);
        return mass;
    }

    private Mass convertGram(Double amount){
        Mass mass = new Mass();
        mass.setMilligram(amount * 1000);
        mass.setGram(amount);
        mass.setDecagram(amount * 0.1);
        mass.setKilogram(amount *  0.001);
        mass.setTon(amount * 1.0e-6);
        mass.setOunce(amount * 0.0353);
        mass.setPound(amount * 0.0022);
        return mass;
    }
    private Mass convertDecagram(Double amount){
        Mass mass = new Mass();
        mass.setMilligram(amount * 10000);
        mass.setGram(amount * 10);
        mass.setDecagram(amount);
        mass.setKilogram(amount * 0.1);
        mass.setTon(amount * 1.0e-5);
        mass.setOunce(0.3527);
        mass.setPound(0.022);
        return mass;
    }
    private Mass convertKilogram(Double amount){
        Mass mass = new Mass();
        mass.setMilligram(amount * 1.0e+6);
        mass.setGram(amount * 1000);
        mass.setDecagram(amount * 100);
        mass.setKilogram(amount);
        mass.setTon(amount * 0.001);
        mass.setOunce(amount * 35.274);
        mass.setPound(amount * 2.2046);
        return mass;
    }
    private Mass convertTone(Double amount){
        Mass mass = new Mass();
        mass.setMilligram(amount * 1.0e+9);
        mass.setGram(amount * 1.0e+6);
        mass.setDecagram(amount * 100000);
        mass.setKilogram(amount * 1000);
        mass.setTon(amount);
        mass.setOunce(amount * 35273.9621);
        mass.setPound(amount * 2204.6226);
        return mass;
    }
    private Mass convertOunce(Double amount){
        Mass mass = new Mass();
        mass.setMilligram(amount * 28349.523);
        mass.setGram(amount * 28.3495);
        mass.setDecagram(amount * 2.835);
        mass.setKilogram(amount * 0.0283);
        mass.setTon(amount * 2.28350e-5);
        mass.setOunce(amount);
        mass.setPound(0.0625);
        return mass;
    }
    private Mass convertPound(Double amount){
        Mass mass = new Mass();
        mass.setMilligram(amount * 4.5359e+5);
        mass.setGram(amount * 453.5924);
        mass.setDecagram(amount * 45.3592);
        mass.setKilogram(amount * 0.4536);
        mass.setTon(amount * 0.0005);
        mass.setOunce(amount * 16);
        mass.setPound(amount);
        return mass;
    }


}
