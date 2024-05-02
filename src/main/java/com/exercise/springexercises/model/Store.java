package com.exercise.springexercises.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "m_store")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name", nullable = false,unique = true)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone number", nullable = false)
    private String phoneNumber;

    @Column(name = "address" , nullable = false)
    private String address;


    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private List<BookPrice> bookPrice;
}
