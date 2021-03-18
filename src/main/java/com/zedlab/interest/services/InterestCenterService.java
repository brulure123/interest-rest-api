package com.zedlab.interest.services;

import com.zedlab.interest.entities.InterestCenter;
import com.zedlab.interest.repositories.InterestCenterRepository;
import org.springframework.stereotype.Service;

@Service
public class InterestCenterService {

    private final InterestCenterRepository repository;

    public InterestCenterService(InterestCenterRepository repository) {
        this.repository = repository;
    }

    public InterestCenter saveCenter(InterestCenter center) {
        return this.repository.save(center);
    }

    public InterestCenter updateCenter(InterestCenter center) {
        return this.repository.save(center);
    }

    public void deleteCenter(Long id) {
        this.repository.deleteById(id);
    }
}
