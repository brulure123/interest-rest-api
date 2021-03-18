package com.zedlab.interest.repositories;

import com.zedlab.interest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserById(Long id);

    void deleteUserById(Long id);
}
