package dev.ocaina.stockflowapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Product extends BaseEntity {
    private String name;
    private String description;
    private String sku;
    private float price;
    private int quantity;

    @ManyToOne
    private Category category;
}
