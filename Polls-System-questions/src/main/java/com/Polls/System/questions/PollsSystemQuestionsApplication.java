package com.Polls.System.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class PollsSystemQuestionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PollsSystemQuestionsApplication.class, args);
	}


}
