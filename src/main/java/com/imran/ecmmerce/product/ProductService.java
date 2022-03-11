package com.imran.ecmmerce.product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(int id);

    List<Product>  createProduct(Product product);

    List<Product> deleteProduct(int id);

    List<Product> updateProduct(int id,Product product);
}
