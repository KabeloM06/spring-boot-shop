package com.shop.springbootshop.dao;

import com.shop.springbootshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // accept calls from web browser apps from this origin
public interface ProductRepository extends JpaRepository<Product, Long> {
}
