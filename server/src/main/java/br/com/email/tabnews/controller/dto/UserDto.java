package br.com.email.tabnews.controller.dto;

import java.time.LocalDateTime;

import br.com.email.tabnews.model.User;
import lombok.Getter;

@Getter
public class UserDto {

	private String nome;
	private String email;
	private LocalDateTime dataCriacao;

	public UserDto(User user) {
		this.nome = user.getNome();
		this.email = user.getEmail();
		this.dataCriacao = LocalDateTime.now();
	}
}