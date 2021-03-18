package com.zedlab.interest.controllers;

import com.zedlab.interest.entities.InterestCenter;
import com.zedlab.interest.services.InterestCenterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/center")
public class InterestCenterController {

    private final InterestCenterService service;

    public InterestCenterController(InterestCenterService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<InterestCenter> addInterestCenter(@RequestBody InterestCenter interestCenter){
        InterestCenter center = this.service.saveCenter(interestCenter);
        return new ResponseEntity<>(center, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<InterestCenter> updateInterestCenter(@RequestBody InterestCenter interestCenter) {
        InterestCenter center = this.service.updateCenter(interestCenter);
        return new ResponseEntity<>(center, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteInterestCenter(@PathVariable("id") Long id) {
        this.service.deleteCenter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
