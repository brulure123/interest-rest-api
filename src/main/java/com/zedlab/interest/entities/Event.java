package com.zedlab.interest.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Event")
@Table(name = "event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "eventName", nullable = false)
    private String eventName;

    @Column(name = "eventDescription", nullable = false, columnDefinition = "TEXT")
    private String eventDescription;

    @Column(name = "eventLocation", nullable = false)
    private String eventLocation;

    @Column(name = "eventCost", nullable = false)
    private Integer eventCost;

    @Column(name = "eventDevise", nullable = false)
    private String eventDevise;

    @Column(name = "eventImageUrl", nullable = false)
    private String eventImageUrl;

    @Column(name = "eventDate", nullable = false)
    private Date eventDate;

    public Event(String eventName, String eventDescription, String eventLocation, Integer eventCost, String eventDevise, String eventImageUrl, Date eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventLocation = eventLocation;
        this.eventCost = eventCost;
        this.eventDevise = eventDevise;
        this.eventImageUrl = eventImageUrl;
        this.eventDate = eventDate;
    }
}
