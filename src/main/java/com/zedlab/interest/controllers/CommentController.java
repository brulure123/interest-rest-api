package com.zedlab.interest.controllers;

import com.zedlab.interest.entities.Comment;
import com.zedlab.interest.repositories.CommentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommentController {

    private final CommentRepository commentRepository;

    public CommentController(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @GetMapping("/comments")
    public List<Comment> getComments(){
        return this.commentRepository.findAll();
    }

    @PostMapping("/comments")
    public void addComment(@RequestBody Comment comment){
        this.commentRepository.save(comment);
    }
}
