package com.Owner.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/owner")
public class OwnerController {

	@GetMapping("/message")
	public String test() {
		return "Hello I am From Microservice1";
	}
}