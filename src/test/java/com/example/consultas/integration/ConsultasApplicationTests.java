package com.example.consultas.integration;

import com.example.consultas.controller.QueriesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Testcontainers
class ConsultasApplicationTests {

	@Autowired
	QueriesController queriesController;

	@Test
	void contextLoads() {
		var result = queriesController.getPortfolio("","");
		assertThat(result).isNotNull();
	}

}
