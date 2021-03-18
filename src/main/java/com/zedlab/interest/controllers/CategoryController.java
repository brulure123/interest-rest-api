package com.zedlab.interest.controllers;

import com.zedlab.interest.entities.Category;
import com.zedlab.interest.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return this.categoryRepository.findAll();
    }

    @PostMapping("/categories")
    public void addCategory(@RequestBody Category category){
        this.categoryRepository.save(category);
    }
}
