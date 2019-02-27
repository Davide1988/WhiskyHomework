package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

//    public List<Whisky> findWhiskiesByYear(int year);


    public List<Whisky> findWhiskiesByDistilleryNameAndYear(String name , int year);

    public List<Whisky> findWhiskiesFromParticularRegion(String region);
}
