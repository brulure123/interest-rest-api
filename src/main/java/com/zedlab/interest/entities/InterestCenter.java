package com.zedlab.interest.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "InterestCenter")
@Table(
        name = "interest_center",
        uniqueConstraints = {
                @UniqueConstraint(name = "center_name_unique", columnNames = "centerName")
        }
)
public class InterestCenter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "centerName", nullable = false)
    private String centerName;

    @Column(name = "centerDescription", nullable = false)
    private String centerDescription;
}