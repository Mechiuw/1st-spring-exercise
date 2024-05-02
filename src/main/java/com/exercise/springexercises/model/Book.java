package com.exercise.springexercises.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionIdJdbcTypeCode;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "m_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "title",nullable = false)
    private String title;

    @OneToOne
    @JoinColumn(name = "author_id",unique = true)
    private Author author;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<BookPrice> bookPrices;
}
