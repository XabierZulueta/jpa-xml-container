package com.example.consultas.service;

import com.example.consultas.repository.commercialstructure.CommercialStructureMapper;
import com.example.consultas.repository.commercialstructure.CommercialStructureRepository;
import com.example.consultas.repository.portfolio.PortfolioMapper;
import com.example.consultas.repository.portfolio.PortfolioRepository;
import lombok.RequiredArgsConstructor;
import org.openapitools.model.CommercialStructureData;
import org.openapitools.model.PortfolioData;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class QueriesService {

    private final PortfolioRepository portfolioRepository;

    private final CommercialStructureRepository commercialStructureRepository;

    private final PortfolioMapper portfolioMapper;

    private final CommercialStructureMapper commercialStructureMapper;

    public List<PortfolioData> getPortfolio(String initialDate, String finalDate){
        var list = portfolioRepository.findAll();
        // esta está en el fichero de queries: testSQL.xml
        // portfolioRepository.test();
        return portfolioMapper.map(list);
    }

    public List<CommercialStructureData> getCommercialStructure(List<BigDecimal> ids){
        List<CommercialStructureData> dataList = new ArrayList<>();
        if(ids.isEmpty()){
            //las sacas del usuario
        }else{
            List<Long> longIds = ids.stream().map(BigDecimal::longValue).toList();
            dataList = commercialStructureMapper.map(commercialStructureRepository.findAllById(longIds));
        }
        return dataList;
    }

}
