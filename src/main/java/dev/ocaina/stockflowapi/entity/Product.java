package dev.ocaina.stockflowapi.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String sku;
    private float price;
    private int quantity;

    @ManyToOne
    private Category category;
}
