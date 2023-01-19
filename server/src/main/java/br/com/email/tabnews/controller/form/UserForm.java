package br.com.email.tabnews.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.email.tabnews.model.User;
import lombok.Data;

@Data
public class UserForm {

	@NotBlank @NotNull @NotEmpty
	private String nome;
	@Email
	private String email;
	
	public User converter() {
		return new User(this.nome, this.email);
	}
}
