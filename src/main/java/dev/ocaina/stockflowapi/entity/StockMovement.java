package dev.ocaina.stockflowapi.entity;

import jakarta.persistence.*;

@Table(name= "stock_movement")
@Entity
public class StockMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private MovementType type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String reason;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}
