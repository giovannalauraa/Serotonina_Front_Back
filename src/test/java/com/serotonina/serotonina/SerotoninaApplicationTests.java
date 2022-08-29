package com.serotonina.serotonina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SerotoninaApplicationTests {
	 @GetMapping("/hello")
	 String home(){
		 return "Hello World!";
	 }

	 public static void main(String[] args) {
		 SpringApplication.run(SerotoninaApplicationTests.class, args);
	 }
}


