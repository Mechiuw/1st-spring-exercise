package com.exercise.springexercises.repository;

import com.exercise.springexercises.model.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPriceRepository extends JpaRepository<BookPrice,String> {
}
