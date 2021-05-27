package com.unitconverter.services;

import com.unitconverter.models.Velocity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VelocityService {
    public ResponseEntity<?> convertVelocity(String unit) {
        return convertVelocity(unit, 1.0);
    }

    public ResponseEntity<?> convertVelocity(String unit, Double amount) {
        switch (unit){
            case "kilometersPerHour" : return new ResponseEntity<>(convertKilometerPerHour(amount), HttpStatus.OK);
            case "milesPerHours" : return new ResponseEntity<>(convertMilePerHour(amount), HttpStatus.OK);
            case "kilometersPerSecond" : return new ResponseEntity<>(convertKilometerPerSecond(amount), HttpStatus.OK);
            case "milesPerSecond" : return new ResponseEntity<>(convertMilePerSecond(amount), HttpStatus.OK);
            case "metersPerSecond" : return new ResponseEntity<>(convertMeterPerSecond(amount), HttpStatus.OK);
            case "footPerSecond" : return new ResponseEntity<>(convertFootPerSecond(amount), HttpStatus.OK);
            default:return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting Time resource.");
        }

    }

    private Velocity convertKilometerPerHour(Double amount){
        Velocity velocity = new Velocity();
        velocity.setKilometersPerHour(amount);
        velocity.setMilesPerHours(amount * 0.6214);
        velocity.setKilometersPerSecond(amount * 0.0003);
        velocity.setMilesPerSecond(amount * 0.0002);
        velocity.setMeterPerSecond(amount * 0.2778);
        velocity.setFootPerSecond(amount * 0.9114);
        return velocity;
    }
    private Velocity convertMilePerHour(Double amount){
        Velocity velocity = new Velocity();
        velocity.setKilometersPerHour(amount * 1.6093);
        velocity.setMilesPerHours(amount);
        velocity.setKilometersPerSecond(amount * 0.0004);
        velocity.setMilesPerSecond(amount * 0.0003);
        velocity.setMeterPerSecond(amount * 0.447);
        velocity.setFootPerSecond(amount * 1.4667);
        return velocity;
    }
    private Velocity convertKilometerPerSecond(Double amount){
        Velocity velocity = new Velocity();
        velocity.setKilometersPerHour(amount * 3600);
        velocity.setMilesPerHours(amount * 2236.9363);
        velocity.setKilometersPerSecond(amount);
        velocity.setMilesPerSecond(amount * 0.6214);
        velocity.setMeterPerSecond(amount * 1000);
        velocity.setFootPerSecond(amount * 3280.8399);
        return velocity;
    }
    private Velocity convertMilePerSecond(Double amount){
        Velocity velocity = new Velocity();
        velocity.setKilometersPerHour(amount * 5793.6384);
        velocity.setMilesPerHours(amount * 3600);
        velocity.setKilometersPerSecond(amount * 1.6093);
        velocity.setMilesPerSecond(amount);
        velocity.setMeterPerSecond(amount * 1609.344);
        velocity.setFootPerSecond(amount * 5280);
        return velocity;
    }
    private Velocity convertMeterPerSecond(Double amount){
        Velocity velocity = new Velocity();
        velocity.setKilometersPerHour(amount * 3.6);
        velocity.setMilesPerHours(amount * 2.2369);
        velocity.setKilometersPerSecond(amount * 0.001);
        velocity.setMilesPerSecond(amount * 0.0006);
        velocity.setMeterPerSecond(amount);
        velocity.setFootPerSecond(amount * 3.2808);
        return velocity;
    }
    private Velocity convertFootPerSecond(Double amount){
        Velocity velocity = new Velocity();
        velocity.setKilometersPerHour(amount * 1.0973);
        velocity.setMilesPerHours(amount * 0.6818);
        velocity.setKilometersPerSecond(amount * 0.0003);
        velocity.setMilesPerSecond(amount * 0.0002);
        velocity.setMeterPerSecond(amount * 0.3048);
        velocity.setFootPerSecond(amount);
        return velocity;
    }
}
