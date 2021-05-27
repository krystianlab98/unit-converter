package com.unitconverter.controllers;

import com.unitconverter.models.Temperature;
import com.unitconverter.services.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/")
public class TemperatureController {

    private final TemperatureService temperatureService;

    @Autowired
    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping("temperatures/{unit}")
    public ResponseEntity<?> getDefaultTemperature(@PathVariable String unit){
        return temperatureService.convertTemperature(unit);
    }
    @GetMapping("temperatures/{unit}/{amount}")
    public ResponseEntity<?> getDefaultTemperature(@PathVariable String unit,@PathVariable Double amount){
        return temperatureService.convertTemperature(unit, amount);
    }

}
