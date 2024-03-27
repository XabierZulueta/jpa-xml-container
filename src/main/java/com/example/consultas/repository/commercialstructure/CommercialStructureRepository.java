package com.example.consultas.repository.commercialstructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommercialStructureRepository extends JpaRepository<CommercialStructureEntity, Long> {
}
