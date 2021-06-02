package com.zedlab.interest;

import com.zedlab.interest.entities.User;
import com.zedlab.interest.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zedlab.interest.constants.*;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class InterestApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository repository, PasswordEncoder passwordEncoder) {

		UserRole userRole = UserRole.SUPER_ADMIN;

		return args -> {
			User user = new User("benraj.200@gmail.com", "imageUrl","wallImageUrl","brulure123", passwordEncoder.encode("23617252"), true, true, true, true, userRole);
			//User user2 = new User("James Bond", "bondjay", "jamesJay12", "jamesbond@gmail.com", "imageUrl", "wallImageUrl", userRoles2);
			repository.save(user);
			//repository.save(user2);
		};
	}
}
