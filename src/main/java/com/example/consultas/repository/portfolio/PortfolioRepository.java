package com.example.consultas.repository.portfolio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository extends JpaRepository<PortfolioEntity, Long> {

    List<PortfolioEntity> test(String society);
}
