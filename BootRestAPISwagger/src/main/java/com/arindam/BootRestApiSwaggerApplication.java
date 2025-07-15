package com.arindam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
/*@OpenAPIDefinition(
	    info = @Info(
	        title = "Customer API",
	        version = "1.0",
	        description = "REST API for managing Customer with MySQL and JPA",
	        termsOfService = "https://example.com/terms",
	        contact = @Contact(
	            name = "Arindam Sengupta",
	            url = "https://github.com",
	            email = "test@test.com"
	        ),
	        license = @License(
	            name = "xyz ltd",
	            url = "https://www.xyz.com/licenses/LICENSE-2.0.html"
	        )
	    )
	)*/
@SpringBootApplication
public class BootRestApiSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestApiSwaggerApplication.class, args);
	}

}
