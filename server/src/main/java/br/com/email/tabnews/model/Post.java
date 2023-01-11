package br.com.email.tabnews.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "posts_registered")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ownerName;
	private int tabCoins;
	private LocalDateTime datePublished;

	private String idPost;
	private String slug;
	private String title;
	@Column(columnDefinition = "TEXT")
	private String body;

}
