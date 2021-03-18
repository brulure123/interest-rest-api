package com.zedlab.interest.services;

import com.zedlab.interest.entities.Event;
import com.zedlab.interest.exceptions.EventNotFoundException;
import com.zedlab.interest.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event findEventById(Long id){
        return this.eventRepository.findById(id)
                .orElseThrow(() -> new EventNotFoundException("Event by id " + id + " was not found."));
    }

    public Event saveEvent(Event event) {
        return this.eventRepository.save(event);
    }

    public Event updateEvent(Event event) {
        return this.eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        this.eventRepository.deleteById(id);
    }
}
