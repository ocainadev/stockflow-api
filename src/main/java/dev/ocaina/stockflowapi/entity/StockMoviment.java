package dev.ocaina.stockflowapi.entity;

import jakarta.persistence.*;

@Entity
public class StockMoviment{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private MovimentType type;
    private int quantity;
    private String reason;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}
