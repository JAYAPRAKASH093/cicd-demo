package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "CI/CD Pipeline Running Successfully";
    }
}

}
