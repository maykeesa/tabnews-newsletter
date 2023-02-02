package br.com.email.tabnews.model.request;

import lombok.Data;

@Data
public class PostStartPageRequest {

	private String slug;
	private String owner_username;
}
