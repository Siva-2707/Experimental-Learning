package com.siva.springBoot.starterProject;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterProjectApplication.class, args);
		
	}

}

@RestController
class ContentController{
	@GetMapping("/content")
	public List<Content> getContent(){
		return List.of(new Content(1,"Siva"));
	}
}
