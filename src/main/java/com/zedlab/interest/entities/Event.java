package com.zedlab.interest.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_name") private String eventName;

    @Column(name = "event_description") private String eventDescription;

    @Column(name = "event_location") private String eventLocation;

    @Column(name = "event_cost") private String eventCost;

    @Column(name = "event_image") private String eventImagePath;

    @Column(name = "event_date") private Date eventDate;
}
