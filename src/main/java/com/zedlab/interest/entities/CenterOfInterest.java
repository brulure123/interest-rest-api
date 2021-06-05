package com.zedlab.interest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CenterOfInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String designation;

    @Column(nullable = false)
    private String centerInterestImageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    public CenterOfInterest(String designation, String centerInterestImageUrl) {
        this.designation = designation;
        this.centerInterestImageUrl = centerInterestImageUrl;
    }
}
