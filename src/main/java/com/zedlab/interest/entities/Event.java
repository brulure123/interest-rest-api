package com.zedlab.interest.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

}
