package com.zedlab.interest.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Comment")
@Table(name = "comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "commentContent", columnDefinition = "TEXT", nullable = false)
    private String commentContent;

    @Column(name = "commentDate", nullable = false)
    private Date commentDate;

    public Comment(String commentContent, Date commentDate) {
        this.commentContent = commentContent;
        this.commentDate = commentDate;
    }
}
