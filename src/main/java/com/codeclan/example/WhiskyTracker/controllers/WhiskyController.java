package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {



    @Autowired
    WhiskyRepository whiskyRepository;


    @GetMapping
    public List<Whisky> getAllWhiskies(){
        return whiskyRepository.findAll();
    }

//
//
//    @GetMapping(value = "/year")



    @GetMapping(value= "/{year}")
    public List<Whisky> getWhiskyForGivenYear(@PathVariable int year){
        return whiskyRepository.findWhiskiesByYear(year);
    }

//
//    @GetMapping(value= "/{distillery}/{year}")
//    public List<Whisky> @GetMapping(value= "/{distillery}/{year}")(@PathVariable Distillery distillery, int year){
//        return whiskyRepository.getWhiskiesByDistilleryAndYear(distillery,year);
//    }   THIS DOESN'T WORK AND I KNOW WHY



    @GetMapping(value= "/distilleryName/{distilleryName}/year/{year}")
    public List<Whisky> getWhiskiesForDistilleryNameAndYear(@PathVariable String name, int year){
        return whiskyRepository.findWhiskiesByDistilleryNameAndYear(name, year);
    }



    @GetMapping(value= "/region/{region}")
    public List<Whisky> getWhiskiesForDistilleryNameAndYear(@PathVariable String region){
        return whiskyRepository.findWhiskiesFromParticularRegion(region);
    }


}
