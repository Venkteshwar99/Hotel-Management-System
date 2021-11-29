package com.Receptionist.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receptionist")
public class ReceptionistController {

	@GetMapping("/message")
	public String test() {
		return "Hello I am From Microservice3";
	}
}