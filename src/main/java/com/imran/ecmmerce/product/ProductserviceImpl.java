package com.imran.ecmmerce.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductserviceImpl implements ProductService{
    private  ProductRepository productRepository;

    public ProductserviceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> createProduct(Product product) {
        productRepository.save(product);
        return productRepository.findAll();
    }

    @Override
    public List<Product> deleteProduct(int id) {
        productRepository.deleteById(id);
        return productRepository.findAll();
    }

    @Override
    public List<Product> updateProduct(int id, Product product) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            productRepository.save(product);
        }

        return productRepository.findAll();
    }
}
