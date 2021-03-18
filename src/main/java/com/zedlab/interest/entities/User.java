package com.zedlab.interest.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User")
@Table(
        name = "user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_pseudo_unique", columnNames = "userPseudo"),
                @UniqueConstraint(name = "user_email_unique", columnNames = "userEmail")
        }
)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "userPseudo", nullable = false)
    private String userPseudo;

    @Column(name = "userPassword", nullable = false)
    private String userPassword;

    @Column(name = "userEmail", nullable = false)
    private String userEmail;

    @Column(name = "userImageUrl")
    private String userImageUrl;

    @Column(name = "userWallImageUrl")
    private String userWallImageUrl;

    @Column(name = "userRole", nullable = false)
    private String userRole;

    public User(String userName, String userPseudo, String userPassword, String userEmail, String userImageUrl, String userWallImageUrl, String userRole) {
        this.userName = userName;
        this.userPseudo = userPseudo;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userImageUrl = userImageUrl;
        this.userWallImageUrl = userWallImageUrl;
        this.userRole = userRole;
    }
}
