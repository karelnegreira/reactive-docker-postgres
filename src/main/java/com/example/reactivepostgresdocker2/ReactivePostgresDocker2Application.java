package com.example.reactivepostgresdocker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
//@EntityScan("com.example.reactivepostgresdocker2.model")
public class ReactivePostgresDocker2Application {

	public static void main(String[] args) {
		SpringApplication.run(ReactivePostgresDocker2Application.class, args);
	}

}

