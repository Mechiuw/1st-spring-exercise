package com.exercise.springexercises.repository;

import com.exercise.springexercises.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store,String> {
}
