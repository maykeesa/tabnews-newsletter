package br.com.email.tabnews.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.email.tabnews.model.User;

public interface UserRepository extends JpaRepository<User, UUID>{

}
