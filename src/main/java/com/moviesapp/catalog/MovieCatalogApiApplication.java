package com.moviesapp.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MovieCatalogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApiApplication.class, args);
	}

}
