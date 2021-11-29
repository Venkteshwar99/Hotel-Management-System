package com.Manager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/manager")
public class ManagerController {

	@GetMapping("/message")
	public String test() {
		return "Hello I am From Microservice2";
	}
}