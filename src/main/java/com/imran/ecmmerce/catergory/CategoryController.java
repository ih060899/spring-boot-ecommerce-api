package com.imran.ecmmerce.catergory;

import com.imran.ecmmerce.product.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("*")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id") int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public List<Category> createCategory(@RequestBody final Category category) {
        return categoryService.createCategory(category);
    }

    @DeleteMapping("/{id}")
    public List<Category> deleteCategory(@PathVariable int id) {

        return categoryService.deleteCategory(id);
    }

    @PutMapping("/{id}")
    public List<Category> updateCategory(@PathVariable int id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }
}
