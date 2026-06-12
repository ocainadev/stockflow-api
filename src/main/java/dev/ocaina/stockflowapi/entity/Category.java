package dev.ocaina.stockflowapi.entity;

import jakarta.persistence.Entity;

@Entity
public class Category extends BaseEntity {
    private String name;
    private String description;
}
