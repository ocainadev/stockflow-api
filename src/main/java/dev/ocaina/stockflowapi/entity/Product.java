package dev.ocaina.stockflowapi.entity;

import dev.ocaina.stockflowapi.models.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name="product")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

    @Column(nullable = false)
    private String name;
    private BigDecimal price;
    private int quantity;

    private int quantityMin;

    @ManyToOne
    private Category category;
}
