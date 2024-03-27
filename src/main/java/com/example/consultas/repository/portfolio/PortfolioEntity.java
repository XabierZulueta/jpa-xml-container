package com.example.consultas.repository.portfolio;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name="portfolio")
public class PortfolioEntity {

    @Id
    private Long id;

    @Column(name="initial_date")
    private Date initialDate;

    @Column(name="final_date")
    private Date finalDate;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name="society")
    private String society;
}
