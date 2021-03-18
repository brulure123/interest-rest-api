package com.zedlab.interest;

import com.zedlab.interest.entities.Event;
import com.zedlab.interest.entities.User;
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
	CommandLineRunner commandLineRunner(EventRepository eventRepository) {
		return args -> {
			Event event = new Event(
					"Concert à Paris",
					"Le groupe sexion d'assaut se prépare pour la célébration d'un concert à paris",
					"A l'hypnose au 15eme étage, porte 20",
					15000,
					"$",
					"null",
					new Date());
			eventRepository.save(event);
		};
	}
}
