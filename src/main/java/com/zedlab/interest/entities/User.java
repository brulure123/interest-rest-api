package com.zedlab.interest.entities;

import com.zedlab.interest.constants.UserRole;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
@ToString()
@Entity(name = "User")
@Table(
        name = "user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_username_unique", columnNames = "username"),
                @UniqueConstraint(name = "user_email_unique", columnNames = "email"),
        }
)
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String email;
    private String imageUrl;
    private String wallImageUrl;

    //-------------------------------------------------------------
    // Definition of obligatory fields provided by Spring Security |
    //-------------------------------------------------------------
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean isAccountNonExpired;

    @Column(nullable = false)
    private boolean isAccountNonLocked;

    @Column(nullable = false)
    private boolean isCredentialsNonExpired;

    @Column(nullable = false)
    private boolean isEnabled;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User(String email,
                String imageUrl,
                String wallImageUrl,
                String username,
                String password,
                boolean isAccountNonExpired,
                boolean isAccountNonLocked,
                boolean isCredentialsNonExpired,
                boolean isEnabled,
                UserRole role) {

        this.email = email;
        this.imageUrl = imageUrl;
        this.wallImageUrl = wallImageUrl;
        this.username = username;
        this.password = password;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
        this.role = role;
    }

    /**
     * Recuperation a Collection of GrantedAuthorities that is save as an
     * array of String in the database.
     * @return java.util.Collection
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getGrantedAuthorities();
    }
}
