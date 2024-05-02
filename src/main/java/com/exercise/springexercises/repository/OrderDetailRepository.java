package com.exercise.springexercises.repository;

import com.exercise.springexercises.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
