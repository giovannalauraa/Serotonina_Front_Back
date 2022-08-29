package com.serotonina.serotonina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import repository.TarefasRepository;


@SpringBootApplication
public class SerotoninaApplication {

	public static void main(String[] args) {
		TarefasRepository.init();
		SpringApplication.run(SerotoninaApplication.class, args);
	}

}
