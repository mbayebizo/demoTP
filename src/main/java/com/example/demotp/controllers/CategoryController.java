package com.example.demotp.controllers;

import com.example.demotp.models.Category;
import com.example.demotp.services.CategoryService;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
    private final  CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @CrossOrigin(origins = "http://localhost:4200/category")
    @GetMapping("/all")
    public List<Category> findAll(){
        return  categoryService.findAll();
    }
    @GetMapping("{id}")
    private ResponseEntity findOne(@PathVariable long id){
      return  categoryService.findOne(id);
    }
    @PostMapping
    public ResponseEntity createUpdate(@RequestBody Category category){
       return categoryService.createUpdate(category);

    }
    @DeleteMapping("{id}")
    public  void delete(@PathVariable long id){
        categoryService.delete(id);
    }
    @DeleteMapping
    public  void delete(){
        System.out.println("");

    }
}
