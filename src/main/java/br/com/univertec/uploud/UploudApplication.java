package br.com.univertec.uploud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "br.com.univertec.repository")
@EntityScan(basePackages = "br.com.univertec.entity")
@ComponentScan(basePackages = "br.com.univertec")
@SpringBootApplication
public class UploudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploudApplication.class, args);
	}

}
