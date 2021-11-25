package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OnlineCustomerServiceCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCustomerServiceCenterApplication.class, args);
		System.out.println("connected to the database");
	}

}
//http://localhost:8080/swagger-ui/index.html}