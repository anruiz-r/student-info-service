package com.example.demo;

import com.example.demo.models.StudentInfo;
import com.example.demo.repositories.StudentInfoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class StudentInfoServiceApplication {
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(StudentInfoRepository studentInfoRepository) {
		return args -> {
			studentInfoRepository.save(new StudentInfo(null, "Ana Pérez", 21));
			studentInfoRepository.save(new StudentInfo(null, "Luis Martínez", 22));
			studentInfoRepository.save(new StudentInfo(null, "María Gómez", 20));
		};
	}
}