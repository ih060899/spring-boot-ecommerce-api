package com.imran.ecmmerce.catergory;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> createCategory(Category category) {
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> deleteCategory(int id) {
        categoryRepository.deleteById(id);
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> updateCategory(int id, Category category) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            categoryRepository.save(category);
        }

        return categoryRepository.findAll();
    }
}
