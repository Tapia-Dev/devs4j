package com.dev4j.jwtuser;

import com.dev4j.jwtuser.model.User;
import com.dev4j.jwtuser.repositories.UserReposiory;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtUserApplication implements ApplicationRunner {

	@Autowired
	private Faker faker;

	@Autowired
	private UserReposiory userReposiory;

	public static void main(String[] args) {
		SpringApplication.run(JwtUserApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for (int i = 0; i < 100000; i++) {
			User user = new User();
			user.setUsername(faker.name().username());
			user.setPassword(faker.dragonBall().character());
			user.setProfile(null);
			userReposiory.save(user);
		}

	}
}
