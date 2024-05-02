package com.exercise.springexercises.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "m_book_price")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "bookId",unique = true)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "storeId", unique = true)
    private Store store;

    @OneToMany(mappedBy = "bookPrice", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<OrderDetail> orderDetail;

}
