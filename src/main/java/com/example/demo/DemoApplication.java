package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication { 

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("msg: Car App started! Goto http://localhost:8081/dic_student_name");
	}
}

@RestController
class DicController {

	@Value("${fullname:Bass}")
	private String fullname;

	@GetMapping("/dic_student_name")
	String getFullName() {
		return "Work done by " + this.fullname + ".";
	}
}
