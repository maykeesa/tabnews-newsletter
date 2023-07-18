package br.com.email.tabnews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.email.tabnews.model.request.PostRequest;
import br.com.email.tabnews.service.connection.ConnectionApiService;

@SpringBootApplication
public class TabnewsNewsletterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TabnewsNewsletterApplication.class, args);
	}
	
	@Autowired
	private ConnectionApiService apiService;
	
	@Override
	public void run(String... args) {
		PostRequest post = apiService.getPost("filipedeschamps", "resultado-de-ter-publicado-no-twitter-um-post-aqui-do-tabnews");
		System.out.println(post);
	}
}
