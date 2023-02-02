package br.com.email.tabnews.model.request;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PostRequest {

	private String owner_username;
	private String title;
	private String body;
	private LocalDateTime published_at;
	private int tabcoins;
}
