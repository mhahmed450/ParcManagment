package com.ensi.ilsi.ParcManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2

@SpringBootApplication
public class ParcManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcManagementApplication.class, args);
	}
}
