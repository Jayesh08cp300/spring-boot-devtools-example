package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	@Value("${spring.devtools.livereload.port}")
	private String livereload_port;

	@GetMapping("/")
	public String printMe() {
		return "Hello World ->" + livereload_port;
	}

	@GetMapping("/{msg}")
	public String printMe(@PathVariable String msg) {
		return " -> " + msg;
	}
}
