package dev.ocaina.stockflowapi.entity;

import jakarta.persistence.Entity;

@Entity
public class User extends BaseEntity {
    private String name;
    private String email;
    private String passwordHash;
    private UserRole role;

}
