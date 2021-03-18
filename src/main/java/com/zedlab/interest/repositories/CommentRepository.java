package com.zedlab.interest.repositories;

import com.zedlab.interest.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
