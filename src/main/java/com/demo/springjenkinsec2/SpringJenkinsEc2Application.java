package com.demo.springjenkinsec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringJenkinsEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsEc2Application.class, args);
	}

}


@RestController("/hello")
class DemoController{
	@GetMapping
	public String demo(){
		return "Hello World";
	}
}