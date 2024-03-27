package com.example.consultas.repository.portfolio;

import org.mapstruct.Mapper;
import org.openapitools.model.PortfolioData;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PortfolioMapper {

    PortfolioData map(PortfolioEntity entity);

    List<PortfolioData> map(List<PortfolioEntity> entities);
}
