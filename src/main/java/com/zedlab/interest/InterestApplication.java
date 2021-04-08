package com.zedlab.interest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterestApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterestApplication.class, args);
	}

	//@Bean
	//CommandLineRunner commandLineRunner(UserRepository repository) {

	//	Set<String> userRoles = new HashSet<>();
	//	userRoles.add(UserRoles.FOLLOWER.name());
	//	userRoles.add(UserRoles.ADVERTISER.name());

	//	return args -> {
	//		User user = new User("Zongwe Benoni", "brulure123", "23617252", "benraj.200@gmail.com", "imageUrl", "wallImageUrl", userRoles);
	//		repository.save(user);
	//	};
	//}
}
