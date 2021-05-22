package com.unitconverter.services;

import com.unitconverter.models.Time;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TimeService {


    public ResponseEntity<?> convertTime(String unit) {
        return convertTime(unit, 1.0 );
    }

    public ResponseEntity<?> convertTime(String unit, Double amount) {

        switch (unit){
            case "nanosecond" : return new ResponseEntity<>(convertNanosecond(amount), HttpStatus.OK);
            case "microsecond" : return new ResponseEntity<>(convertMicrosecond(amount), HttpStatus.OK);
            case "millisecond" : return new ResponseEntity<>(convertMillisecond(amount), HttpStatus.OK);
            case "second" : return new ResponseEntity<>(convertSecond(amount), HttpStatus.OK);
            case "minute" : return new ResponseEntity<>(convertMinute(amount), HttpStatus.OK);
            case "hour" : return new ResponseEntity<>(convertHour(amount), HttpStatus.OK);
            default:return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting Time resource.");
        }
    }

    private Time convertNanosecond(Double amount){
        Time time = new Time();
        time.setNanosecond(amount);
        time.setMicrosecond(amount * 0.001);
        time.setMillisecond(amount * 0.000001);
        time.setSecond(amount * 1.0e-9);
        time.setMinute(amount * 1.666667e-11);
        time.setHour(amount * 2.777778e-13);

        return time;
    }
    private Time convertMicrosecond(Double amount){
        Time time = new Time();
        time.setNanosecond(amount * 1000);
        time.setMicrosecond(amount);
        time.setMillisecond(amount *0.0001);
        time.setSecond(amount * 0.000001);
        time.setMinute(amount * 1.666667e-8);
        time.setHour(amount * 2.777778e-10);
        return time;
    }
    private Time convertMillisecond(Double amount){
        Time time = new Time();
        time.setNanosecond(amount * 1.0e+6);
        time.setMicrosecond(amount * 1000);
        time.setMillisecond(amount);
        time.setSecond(amount * 0.001);
        time.setMinute(amount * 0.000017);
        time.setHour(amount * 2.777778e-7);
        return time;
    }
    private Time convertSecond(Double amount){
        Time time = new Time();
        time.setNanosecond(amount * 1.0e+9);
        time.setMicrosecond(amount * 1.0e+6);
        time.setMillisecond(amount * 1000);
        time.setSecond(amount);
        time.setMinute(amount * 0.016667);
        time.setHour(amount * 0.000278);
        return time;
    }
    private Time convertMinute(Double amount){
        Time time = new Time();
        time.setNanosecond(amount * 6.0e+10);
        time.setMicrosecond(amount * 6.0e+7);
        time.setMillisecond(amount * 60000);
        time.setSecond(amount * 60);
        time.setMinute(amount);
        time.setHour(amount * 0.016667);
        return time;
    }
    private Time convertHour(Double amount){
        Time time = new Time();
        time.setNanosecond(amount * 3.6e+12);
        time.setMicrosecond(amount * 3.6e+9);
        time.setMillisecond(amount * 3.6e+6);
        time.setSecond(amount * 3600);
        time.setMinute(amount * 60);
        time.setHour(amount);
        return time;
    }

}
