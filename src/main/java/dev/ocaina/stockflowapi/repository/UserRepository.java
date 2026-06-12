package dev.ocaina.stockflowapi.repository;

import dev.ocaina.stockflowapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
