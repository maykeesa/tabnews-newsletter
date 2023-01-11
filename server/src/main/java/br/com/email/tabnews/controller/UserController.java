package br.com.email.tabnews.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.email.tabnews.controller.dto.UserDto;
import br.com.email.tabnews.controller.form.UserForm;

@RestController("/user")
public class UserController {

	@PostMapping("/register")
	public ResponseEntity<UserDto> cadastrar(@RequestBody UserForm form){
		return ResponseEntity.ok().build();
	}
}
