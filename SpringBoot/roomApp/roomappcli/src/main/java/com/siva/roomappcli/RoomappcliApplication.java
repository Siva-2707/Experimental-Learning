package com.siva.roomappcli;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RoomappcliApplication {
	private static final Logger LOG = LoggerFactory.getLogger(RoomappcliApplication.class);
	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder){
		return restTemplateBuilder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate){
		return args -> {
			LOG.info("Starting CLI application");
			ResponseEntity<List<Room>> response = restTemplate.exchange("http://localhost:8080/api/rooms",HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>(){});

			response.getBody().forEach(room -> LOG.info(room.toString()));
			
			LOG.info("Ending CLI application");

		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RoomappcliApplication.class, args);
	}

}
