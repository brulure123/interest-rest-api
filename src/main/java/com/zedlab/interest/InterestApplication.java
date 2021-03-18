package com.zedlab.interest;

import com.zedlab.interest.entities.Category;
import com.zedlab.interest.entities.Event;
import com.zedlab.interest.entities.User;
import com.zedlab.interest.repositories.CategoryRepository;
import com.zedlab.interest.repositories.EventRepository;
import com.zedlab.interest.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class InterestApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CategoryRepository categoryRepository) {
		return args -> {
			Category category = new Category(
					"Sport",
					"Cette category regroupe tous les sports du monde",
					4
			);
			categoryRepository.save(category);
		};
	}
}
