package com.zedlab.interest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String designation;

    @Column(nullable = false)
    private String imageCategoryUrl;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private Set<CenterOfInterest> centerOfInterests;

    public Category(String designation, String imageCategoryUrl) {
        this.designation = designation;
        this.imageCategoryUrl = imageCategoryUrl;
    }
}
