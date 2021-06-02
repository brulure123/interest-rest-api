package com.zedlab.interest.services;

import com.zedlab.interest.entities.Event;
import com.zedlab.interest.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository repository;

    @Autowired
    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> findAllEvents() {
        return repository.findAll();
    }
}
