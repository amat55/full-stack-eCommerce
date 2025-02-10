package com.senocakahmet.ecommerce.dao;

import com.senocakahmet.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
