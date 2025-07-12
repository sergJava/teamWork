package org.skypro.teamWork;

//import org.skypro.teamWork.configuration.RecommendationsDataSourceConfiguration;
//import org.skypro.teamWork.repository.RecommendationsRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@OpenAPIDefinition
public class TeamWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamWorkApplication.class, args);
	}

}
