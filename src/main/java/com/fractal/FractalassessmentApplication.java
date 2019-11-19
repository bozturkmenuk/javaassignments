package com.fractal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.fractal")
@EnableCaching
public class FractalassessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FractalassessmentApplication.class, args);
	}

}
