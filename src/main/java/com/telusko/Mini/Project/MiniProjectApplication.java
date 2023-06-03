package com.telusko.Mini.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}

	@Autowired
	JourneyDB db;


	@Override
	public void run(String... args) throws Exception {
		JourneyDetails passenger1 = new JourneyDetails("Khader Basha", 7, 300, "Kadapa" , "1-01-2023");
		db.save(passenger1);
	}

}
