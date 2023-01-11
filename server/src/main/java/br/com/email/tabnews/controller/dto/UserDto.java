package br.com.email.tabnews.controller.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class UserDto {

	private String nome;
	private String email;
	private String numero;
	private LocalDateTime dataCriacao = LocalDateTime.now();

}