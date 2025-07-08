package com.arindam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arindam.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{

}
