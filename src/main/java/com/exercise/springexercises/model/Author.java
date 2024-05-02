package com.exercise.springexercises.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "m_author")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false,unique = true)
    private String email;
}
