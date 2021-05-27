package com.unitconverter.controllers;

import com.unitconverter.models.Velocity;
import com.unitconverter.services.VelocityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/")
public class VelocityController {

    private VelocityService velocityService;

    @Autowired
    public VelocityController(VelocityService velocityService) {
        this.velocityService = velocityService;
    }


    @GetMapping("velocity/{unit}")
    public ResponseEntity<?> getDefaultVelocity(@PathVariable String unit){
        return   velocityService.convertVelocity(unit);
    }


    @GetMapping("velocity/{unit}/{amount}")
    public ResponseEntity<?> getCustomVelocity(@PathVariable String unit, @PathVariable Double amount){
        return   velocityService.convertVelocity(unit, (Double) amount);
    }
}
