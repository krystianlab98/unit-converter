package com.unitconverter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/api")
public class ViewController {

    @GetMapping("")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/lengths")
    public String getLength(){
        return "length";
    }

    @GetMapping("/mass")
    public String getMass(){ return "mass"; }

    @GetMapping("/temperatures")
    public String getTemperature(){ return "temperature"; }

    @GetMapping("/times")
    public String getTime(){ return "time"; }

    @GetMapping("/velocity")
    public String getVelocity(){ return "velocity"; }


}
