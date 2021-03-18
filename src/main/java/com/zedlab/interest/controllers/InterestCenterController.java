package com.zedlab.interest.controllers;

import com.zedlab.interest.entities.InterestCenter;
import com.zedlab.interest.repositories.InterestCenterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InterestCenterController {

    private final InterestCenterRepository interestCenterRepository;

    public InterestCenterController(InterestCenterRepository interestCenterRepository) {
        this.interestCenterRepository = interestCenterRepository;
    }

    @GetMapping("/interests")
    public List<InterestCenter> getInterestCenter(){
        return this.interestCenterRepository.findAll();
    }

    @PostMapping("/interests")
    public void addInterestCenter(@RequestBody InterestCenter interestCenter){
        this.interestCenterRepository.save(interestCenter);
    }
}
