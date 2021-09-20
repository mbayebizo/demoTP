package com.example.demotp.services;

import com.example.demotp.models.Category;
import com.example.demotp.repositories.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> findAll(){
        return  categoryRepository.findAll().stream().filter(_f-> _f.getNom()!= null).collect(Collectors.toList());
    }
    public ResponseEntity findOne(long id){
        var cat = categoryRepository.findById(id);
        return cat.map(ResponseEntity::ok).orElseGet(() -> (ResponseEntity) ResponseEntity.EMPTY);
    }

    public ResponseEntity createUpdate(Category category){
        var s = categoryRepository.saveAndFlush(category);
        return ResponseEntity.ok(s);
    }
    public  void delete(long id){
        categoryRepository.deleteById(id);
    }
}
