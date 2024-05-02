package com.exercise.springexercises.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "m_customer")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "age",nullable = false)
    private Integer age;

}
