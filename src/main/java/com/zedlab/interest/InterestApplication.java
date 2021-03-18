package com.zedlab.interest;

import com.zedlab.interest.entities.User;
import com.zedlab.interest.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterestApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			User user = new User("Zongwe Benoni",
					"brulure123",
					"23617252",
					"benraj.200@gmail.com",
					null,
					null,
					"SimpleUser");
			userRepository.save(user);
		};
	}
}
