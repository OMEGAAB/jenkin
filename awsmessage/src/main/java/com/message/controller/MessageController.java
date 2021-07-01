package com.message.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.message.model.Message;

@RestController
public class MessageController {
	
	@GetMapping("/message")
	public String showMessage() {
		return "Helllo I am living in S3 and Pulled by EC2";
	}
	
	@GetMapping("/messagebean")
	public Message showMessageObject() {
		return new Message("Magic of Spring Boot Auto-configuration. Getting message in json format done by Jackson");
	}

}
