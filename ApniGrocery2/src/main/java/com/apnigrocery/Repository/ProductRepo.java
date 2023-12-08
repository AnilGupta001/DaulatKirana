package com.apnigrocery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnigrocery.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
