package com.zedlab.interest.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Category")
@Table(
        name = "category",
        uniqueConstraints = {
                @UniqueConstraint(name = "category_name_unique", columnNames = "categoryName")
        }
)
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "categoryName", nullable = false)
    private String categoryName;

    @Column(name = "categoryDescription", nullable = false)
    private String categoryDescription;

    @Column(name = "categoryStars", nullable = false)
    private Integer categoryStars;

    public Category(String categoryName, String categoryDescription, Integer categoryStars) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryStars = categoryStars;
    }
}
