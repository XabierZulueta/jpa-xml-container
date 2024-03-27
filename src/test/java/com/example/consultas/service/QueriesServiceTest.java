package com.example.consultas.service;

import com.example.consultas.repository.commercialstructure.CommercialStructureEntity;
import com.example.consultas.repository.commercialstructure.CommercialStructureMapper;
import com.example.consultas.repository.commercialstructure.CommercialStructureRepository;
import com.example.consultas.repository.portfolio.PortfolioEntity;
import com.example.consultas.repository.portfolio.PortfolioMapper;
import com.example.consultas.repository.portfolio.PortfolioRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openapitools.model.CommercialStructureData;
import org.openapitools.model.PortfolioData;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class QueriesServiceTest {

    @Mock
    PortfolioRepository portfolioRepository;

    @Mock
    CommercialStructureRepository commercialStructureRepository;

    @Mock
    PortfolioMapper portfolioMapper;

    @Mock
    CommercialStructureMapper commercialStructureMapper;

    @InjectMocks
    QueriesService queriesService;

    @Test
    public void getPortfolioTest() {
        when(portfolioRepository.findAll()).thenReturn(
                List.of(new PortfolioEntity())
        );
        when(portfolioMapper.map(anyList())).thenReturn(List.of(new PortfolioData()));

        var result = queriesService.getPortfolio("","");
        assertThat(result).isNotNull();
    }

    @Test
    public void getCommercialStructureTest() {
        when(commercialStructureRepository.findAllById(anyList())).thenReturn(
                List.of(new CommercialStructureEntity())
        );
        when(commercialStructureMapper.map(anyList())).thenReturn(List.of(new CommercialStructureData()));

        var result = queriesService.getCommercialStructure(List.of(BigDecimal.ONE));
        assertThat(result).isNotNull();
    }
}
