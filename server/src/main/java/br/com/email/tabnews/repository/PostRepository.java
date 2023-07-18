package br.com.email.tabnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.email.tabnews.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
