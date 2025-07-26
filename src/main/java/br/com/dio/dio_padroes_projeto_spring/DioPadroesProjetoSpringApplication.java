package br.com.dio.dio_padroes_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os Seguintes módulos foram utilizados:
 * - Spring Web
 * - Spring Data JPA
 * - H2 Database
 * - OpenFeigh
 * 
 * @author rodolfomfabreu
 */
@EnableFeignClients
@SpringBootApplication
public class DioPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioPadroesProjetoSpringApplication.class, args);
	}

}
