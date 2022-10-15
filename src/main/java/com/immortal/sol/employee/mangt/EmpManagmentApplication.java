package com.immortal.sol.employee.mangt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.immortal.sol.employee.mangt.util.AppCache;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmpManagmentApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(EmpManagmentApplication.class, args);
		System.out.println("|'''''''''''''''''''''''''''''''''''''''|");
		System.out.println("|   Welcome To Employee Management      |");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''");
		//AppCache.loadCache();
		//System.out.println("---App cache loaded successfully---");
	}
	
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors
						.basePackage("com.immortal.sol.employee.mangt"))
				.build().apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {

		@SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo(
                "Employee Management",
                "An application for employee/depatyment details contacs/address add,edit and delete ",
                "employee mangement v1",
                "Terms of service",
                "immortal@gmail.com",
                "License of API",
                "https://swagger.io/docs/");

        return apiInfo;
    }

}
