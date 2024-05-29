package com.example.springbootapi.repository;

import com.example.entity.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Product entity.
 */
@Repository //Specifies that this interface is a repository, and Spring will create an instance of it automatically.
public interface ProductRepository {
    public Product saveProduct(Product product);
    public Product save(Product product);
    public List<Product> getAllProducts();
    public List<Product> findAll();
    public Optional<Product> findById(Long id);
    public void deleteById(Long id);
    
}
