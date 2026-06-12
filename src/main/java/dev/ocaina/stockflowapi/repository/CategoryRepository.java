package dev.ocaina.stockflowapi.repository;

import dev.ocaina.stockflowapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
