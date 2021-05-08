package com.unitconverter.controllers;

import com.unitconverter.models.Length;
import com.unitconverter.services.LengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/web/api/lengths")
public class LengthController {

    LengthService lengthService;

    @Autowired
    public LengthController(LengthService lengthService) {
        this.lengthService = lengthService;
    }

    @GetMapping()
    public ResponseEntity<?> getLengthUnits(){
        Length length = new Length();
        return new ResponseEntity<>(length, HttpStatus.OK);
    }

    @GetMapping("/{unit}")
    public ResponseEntity<?> getDefaultLength(@PathVariable String unit){
        return   lengthService.convertLength(unit);
    }


    @GetMapping("/{unit}/{amount}")
    public ResponseEntity<?> getCustomLength(@PathVariable String unit, @PathVariable Double amount){
        return   lengthService.convertLength(unit, (Double) amount);
    }

}
