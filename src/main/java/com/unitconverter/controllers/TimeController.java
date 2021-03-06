package com.unitconverter.controllers;


import com.unitconverter.models.Time;
import com.unitconverter.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/web/api/")
public class TimeController {

    TimeService timeService;

    @Autowired
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }


    @GetMapping("times/{unit}")
    public ResponseEntity<?> getDefaultTime(@PathVariable String unit){
        return   timeService.convertTime(unit);
    }


    @GetMapping("times/{unit}/{amount}")
    public ResponseEntity<?> getCustomTime(@PathVariable String unit, @PathVariable Double amount){
        return   timeService.convertTime(unit, (Double) amount);
    }

}

