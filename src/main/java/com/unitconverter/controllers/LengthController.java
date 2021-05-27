package com.unitconverter.controllers;

import com.unitconverter.models.Length;
import com.unitconverter.services.LengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/web/api/")
public class LengthController {

    LengthService lengthService;

    @Autowired
    public LengthController(LengthService lengthService) {
        this.lengthService = lengthService;
    }


    @GetMapping("lengths/{unit}")
    public ResponseEntity<?> getDefaultLength(@PathVariable String unit){
        return   lengthService.convertLength(unit);
    }


    @GetMapping("lengths/{unit}/{amount}")
    public ResponseEntity<?> getCustomLength(@PathVariable String unit, @PathVariable Double amount){
        return   lengthService.convertLength(unit, (Double) amount);
    }

}
