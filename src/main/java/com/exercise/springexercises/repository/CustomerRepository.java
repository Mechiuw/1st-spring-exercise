package com.exercise.springexercises.repository;

import com.exercise.springexercises.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
