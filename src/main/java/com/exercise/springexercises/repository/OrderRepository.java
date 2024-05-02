package com.exercise.springexercises.repository;

import com.exercise.springexercises.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,String> {
}
