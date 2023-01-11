package br.com.email.tabnews.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@GetMapping("/teste")
	public String teste() {
		return "Hello World";
	}
}
