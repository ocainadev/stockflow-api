package dev.ocaina.stockflowapi.entity;

import dev.ocaina.stockflowapi.models.BaseEntity;
import dev.ocaina.stockflowapi.models.MovementType;
import jakarta.persistence.*;

@Table(name= "stock_movement")
@Entity
public class StockMovement extends BaseEntity {

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
