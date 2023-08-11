package com.cjc.web.crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class WebServiceCrud4Application {

	public static void main(String[] args) {
		System.out.println("Webservice Crud 4");
		SpringApplication.run(WebServiceCrud4Application.class, args);
	}

}