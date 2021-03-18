package com.zedlab.interest.services;

import com.zedlab.interest.entities.Comment;
import com.zedlab.interest.exceptions.CommentNotFoundException;
import com.zedlab.interest.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment findCommentById(Long id) {
        return this.commentRepository.findById(id)
                .orElseThrow(() -> new CommentNotFoundException("Event by id " + id + " was not found."));
    }

    public Comment saveComment(Comment comment) {
        return this.commentRepository.save(comment);
    }

    public Comment updateComment(Comment comment) {
        return this.commentRepository.save(comment);
    }

    public void deleteComment(Long id) {
        this.commentRepository.deleteById(id);
    }
}
