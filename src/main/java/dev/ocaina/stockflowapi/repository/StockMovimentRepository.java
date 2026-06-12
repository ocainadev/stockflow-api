package dev.ocaina.stockflowapi.repository;

import dev.ocaina.stockflowapi.entity.StockMoviment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMovimentRepository extends JpaRepository<StockMoviment, Long> {
}
