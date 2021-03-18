package com.zedlab.interest.repositories;

import com.zedlab.interest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
