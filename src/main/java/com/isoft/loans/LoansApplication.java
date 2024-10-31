package com.isoft.loans;

import com.isoft.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.isoft.commons", "com.isoft.loans"})
@EnableJpaRepositories("com.isoft.loans.repository")
@EntityScan("com.isoft.loans.entity")
@EnableJpaAuditing(auditorAwareRef = "getAuditAware")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@EnableAspectJAutoProxy
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "isoftBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Madan Reddy",
						email = "tutor@isoft.com",
						url = "https://www.isoft.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.isoft.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "isoftBank Loans microservice REST API Documentation",
				url = "https://www.isoft.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
