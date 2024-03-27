package com.example.consultas.repository.commercialstructure;

import com.example.consultas.repository.portfolio.PortfolioEntity;
import org.mapstruct.Mapper;
import org.openapitools.model.CommercialStructureData;
import org.openapitools.model.PortfolioData;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommercialStructureMapper {

    CommercialStructureData map(CommercialStructureEntity entity);

    List<CommercialStructureData> map(List<CommercialStructureEntity> entities);
}
