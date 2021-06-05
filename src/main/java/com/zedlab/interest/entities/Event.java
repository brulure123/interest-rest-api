package com.zedlab.interest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String event;

    @Column(nullable = false)
    private Date dateEvent;

    @Column(nullable = false)
    private String placeEvent;

    @Column(nullable = false)
    private String imageEventUrl;

    public Event(String event, Date dateEvent, String placeEvent, String imageEventUrl) {
        this.event = event;
        this.dateEvent = dateEvent;
        this.placeEvent = placeEvent;
        this.imageEventUrl = imageEventUrl;
    }
}
