package dev.ocaina.stockflowapi.entity;

import dev.ocaina.stockflowapi.models.BaseEntity;
import dev.ocaina.stockflowapi.models.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Table(name= "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User extends BaseEntity {

    private String name;

    @Column(unique = true)
    private String email;

    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private UserRole role;

}
