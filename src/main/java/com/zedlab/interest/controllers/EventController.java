package com.zedlab.interest.controllers;

import com.zedlab.interest.entities.Event;
import com.zedlab.interest.repositories.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("/events")
    public List<Event> getEvents() {
        return this.eventRepository.findAll();
    }

    @PostMapping("/events")
    public void addEvent(@RequestBody Event event){
        eventRepository.save(event);
    }
}
