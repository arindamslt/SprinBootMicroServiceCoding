package com.arindam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arindam.model.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {

}
