package com.example.consultas.controller;

import com.example.consultas.service.QueriesService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.model.PortfolioData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(QueriesController.class)
public class QueriesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private QueriesService queriesService;

    @Test
    public void get_portfolio_test() throws Exception {
        var society = "MOCKED_SOCIETY";
        PortfolioData portfolioData = new PortfolioData();
        portfolioData.setSociety(society);

        // Mocking the behavior of the UserService
        when(queriesService.getPortfolio("","")).thenReturn(List.of(portfolioData));

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/portfolio")
                        .param("initialDate", "")
                        .param("finalDate", "")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].society").value(society));
    }
}
