package com.zedlab.interest.repositories;

import com.zedlab.interest.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
