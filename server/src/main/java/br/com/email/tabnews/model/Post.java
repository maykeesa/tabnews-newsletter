package br.com.email.tabnews.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private String donoNome;
	private int tabCoins;
	private LocalDateTime dataPublicacao;
	private String slug;
	private String titulo;
	@Column(columnDefinition = "TEXT")
	private String body;

	public Post(){

	}
}
