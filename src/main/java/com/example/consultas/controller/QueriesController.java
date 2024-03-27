package com.example.consultas.controller;


import com.example.consultas.service.QueriesService;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.QueriesApi;
import org.openapitools.model.CommercialStructureData;
import org.openapitools.model.CommercialStructureRequest;
import org.openapitools.model.PortfolioData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class QueriesController implements QueriesApi {

    private final QueriesService queriesService;

    @Override
    public ResponseEntity<List<CommercialStructureData>> getCommercialStructure(CommercialStructureRequest commercialStructureRequest) {
        return QueriesApi.super.getCommercialStructure(commercialStructureRequest);
    }

    @Override
    public ResponseEntity<List<PortfolioData>> getPortfolio(String initialDate, String finalDate) {
        return ResponseEntity.ok(queriesService.getPortfolio(initialDate,finalDate));
    }
}

