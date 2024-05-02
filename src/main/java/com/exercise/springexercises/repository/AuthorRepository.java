package com.exercise.springexercises.repository;

import com.exercise.springexercises.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,String> {
}
