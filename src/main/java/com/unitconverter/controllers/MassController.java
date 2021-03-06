package com.unitconverter.controllers;

import com.unitconverter.models.Mass;
import com.unitconverter.services.MassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/")
public class MassController {

    private MassService massService;

    @Autowired
    public MassController(MassService massService) {
        this.massService = massService;
    }


    @GetMapping("mass/{unit}")
    public ResponseEntity<?> getDefaultMass(@PathVariable String unit){
        return   massService.convertMass(unit);
    }


    @GetMapping("mass/{unit}/{amount}")
    public ResponseEntity<?> getCustomMass(@PathVariable String unit, @PathVariable Double amount){
        return   massService.convertMass(unit, (Double) amount);
    }

}
