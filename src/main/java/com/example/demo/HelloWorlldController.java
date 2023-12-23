package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorlldController {
	// all these api should return json or xml format
	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello world";
	}

}
