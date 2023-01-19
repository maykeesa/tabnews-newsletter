package br.com.email.tabnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.email.tabnews.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
