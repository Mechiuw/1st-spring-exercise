package com.exercise.springexercises.repository;

import com.exercise.springexercises.model.Book;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {
}
