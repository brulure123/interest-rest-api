package com.zedlab.interest.controllers;

import com.zedlab.interest.entities.Comment;
import com.zedlab.interest.services.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Comment> getComment(@PathVariable("id") Long id){
        Comment comment = this.commentService.findCommentById(id);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment){
        Comment newComment = this.commentService.saveComment(comment);
        return new ResponseEntity<>(newComment, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Comment> updateComment(@RequestBody Comment comment) {
        Comment updateComment = this.commentService.updateComment(comment);
        return new ResponseEntity<>(updateComment, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteComment(@PathVariable("id") Long id) {
        this.commentService.deleteComment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
