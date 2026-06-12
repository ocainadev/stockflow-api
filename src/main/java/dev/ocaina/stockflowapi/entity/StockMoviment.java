package dev.ocaina.stockflowapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StockMoviment extends BaseEntity {
    private MovimentType type;
    private int quantity;
    private String reason;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}
