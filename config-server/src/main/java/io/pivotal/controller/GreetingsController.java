package io.pivotal.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	
	@RequestMapping("/")
	public String getMapping(){
		return "good day";
	}
	
}
