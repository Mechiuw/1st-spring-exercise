package com.exercise.springexercises.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_order_detail")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "orderId", unique = true)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "bookPriceId", unique = true)
    private BookPrice bookPrice;
}
