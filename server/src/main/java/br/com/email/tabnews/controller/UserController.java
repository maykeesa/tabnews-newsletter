package br.com.email.tabnews.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.email.tabnews.model.User;
import br.com.email.tabnews.model.dto.UserDto;
import br.com.email.tabnews.model.form.UserForm;
import br.com.email.tabnews.repository.UserRepository;


@RestController
@RequestMapping("tabnews-newsletter/user")
public class UserController {
	
	@Autowired
	private UserRepository userRep;

	@PostMapping("/register")
	public ResponseEntity<UserDto> cadastrar(@RequestBody @Valid UserForm form, UriComponentsBuilder uriBuilder){
		User user = form.converter();
		this.userRep.save(user);
		
		URI uri = uriBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(new UserDto(user));
	}
}
