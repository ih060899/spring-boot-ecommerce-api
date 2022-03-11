package com.imran.ecmmerce.catergory;

import com.imran.ecmmerce.product.Product;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(int id);

    List<Category> createCategory(Category category);

    List<Category> deleteCategory(int id);

    List<Category> updateCategory(int id,Category category);
}
