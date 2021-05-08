package com.unitconverter.services;

import com.unitconverter.models.Length;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LengthService {


    public ResponseEntity<?> convertLength(String unit) {
        return convertLength(unit, 1.0);
    }

    public ResponseEntity<?> convertLength(String unit, Double amount) {

        switch(unit) {
            case "kilometer":return new ResponseEntity<>(convertKilometer(amount), HttpStatus.OK);
            case "meter":return new ResponseEntity<>(convertMeter(amount), HttpStatus.OK);
            case "decimeter":return new ResponseEntity<>(convertDecimeter(amount), HttpStatus.OK);
            case "centimeter":return new ResponseEntity<>(convertCentimeter(amount), HttpStatus.OK);
            case "millimeter":return new ResponseEntity<>(convertMillimeter(amount), HttpStatus.OK);
            case "mile":return new ResponseEntity<>(convertMile(amount), HttpStatus.OK);
            case "yard":return new ResponseEntity<>(convertYard(amount), HttpStatus.OK);
            case "inch":return new ResponseEntity<>(convertInch(amount), HttpStatus.OK);
            case "foot":return new ResponseEntity<>(convertFoot(amount), HttpStatus.OK);
            default:return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting the resource.");
        }
    }

    private Length convertKilometer(Double amount){
        Length length = new Length();
        length.setKilometer(amount);
        length.setMeter(amount*1000);
        length.setDecimeter(amount*10000);
        length.setCentimeter(amount*100000);
        length.setMillimeter(amount*1000000);
        length.setMile(amount*0.62137119224);
        length.setYard(amount*1093.613);
        length.setFoot(amount*3280.84);
        length.setInch(amount*39370.079);
        return length;
    }
    private Length convertMeter(Double amount){
        Length length = new Length();
        length.setKilometer(amount*0.001);
        length.setMeter(amount);
        length.setDecimeter(amount*10);
        length.setCentimeter(amount*100);
        length.setMillimeter(amount*1000);
        length.setMile(amount*0.00062137119);
        length.setYard(amount*1.094);
        length.setFoot(amount*3.281);
        length.setInch(amount*39.37);
        return length;
    }
    private Length convertDecimeter(Double amount){
        Length length = new Length();
        length.setKilometer(amount*0.0001);
        length.setMeter(amount*0.1);
        length.setDecimeter(amount);
        length.setCentimeter(amount*10);
        length.setMillimeter(amount*100);
        length.setMile(amount*0.0062137119);
        length.setYard(amount*0.1094);
        length.setFoot(amount*0.3281);
        length.setInch(amount*3.937);
        return length;
    }
    private Length convertCentimeter(Double amount){
        Length length = new Length();
        length.setKilometer(amount*1.0e-5);
        length.setMeter(amount*0.01);
        length.setDecimeter(amount*0.1);
        length.setCentimeter(amount);
        length.setMillimeter(amount*10);
        length.setMile(amount*6.2137119e-6);
        length.setYard(amount*0.01093613298);
        length.setFoot(amount*0.03280839895);
        length.setInch(amount*0.3937007874);

        return length;
    }
    private Length convertMillimeter(Double amount){
        Length length = new Length();
        length.setKilometer(amount*1e-6);
        length.setMeter(amount*0.001);
        length.setDecimeter(amount * 0.01);
        length.setCentimeter(amount*0.1);
        length.setMillimeter(amount);
        length.setMile(amount*6.2137119e-7);
        length.setYard(amount*0.0010936133);
        length.setFoot(amount*0.0032808399);
        length.setInch(amount*0.03937007874);
        return length;
    }
    private Length convertMile(Double amount){
        Length length = new Length();
        length.setKilometer(amount*1.609);
        length.setMeter(amount*1609.344);
        length.setDecimeter(amount*16093.44);
        length.setCentimeter(amount*160934.4);
        length.setMillimeter(amount*1.609e+6);
        length.setMile(amount);
        length.setYard(amount*1760);
        length.setFoot(amount*5280);
        length.setInch(amount*63360);
        return length;
    }
    private Length convertYard(Double amount){
        Length length = new Length();
        length.setKilometer(amount*0.0009144);
        length.setMeter(amount*0.9144);
        length.setDecimeter(amount*9.144);
        length.setCentimeter(amount*91.44);
        length.setMillimeter(amount*914.4);
        length.setMile(amount*0.00056818182);
        length.setYard(amount);
        length.setFoot(amount*3);
        length.setInch(amount*36);
        return length;
    }
    private Length convertFoot(Double amount){
        Length length = new Length();
        length.setKilometer(amount*0.0003048);
        length.setMeter(amount*0.3048);
        length.setDecimeter(amount*3.048);
        length.setCentimeter(amount*30.48);
        length.setMillimeter(amount*304.8);
        length.setMile(amount*0.00018939394);
        length.setYard(amount*0.333333);
        length.setFoot(amount);
        length.setInch(amount*12);
        return length;
    }
    private Length convertInch(Double amount){
        Length length = new Length();
        length.setKilometer(amount*2.54e-5);
        length.setMeter(amount*0.0254);
        length.setDecimeter(amount*0.254);
        length.setCentimeter(amount*2.54);
        length.setMillimeter(amount*25.4);
        length.setMile(amount*1.5782828e-5);
        length.setYard(amount*0.02777777778);
        length.setFoot(amount*0.0833333);
        length.setInch(amount);
        return length;
    }
}
