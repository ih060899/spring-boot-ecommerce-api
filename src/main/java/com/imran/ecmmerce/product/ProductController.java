package com.imran.ecmmerce.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public List<Product> createProduct(@RequestBody final Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@PathVariable int id) {

        return productService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public List<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }
}
