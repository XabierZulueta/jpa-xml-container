package com.example.consultas.repository.commercialstructure;

import com.example.consultas.repository.portfolio.PortfolioEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="commercial_structure")
public class CommercialStructureEntity {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private CommercialStructureEntity parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<CommercialStructureEntity> children;

}
