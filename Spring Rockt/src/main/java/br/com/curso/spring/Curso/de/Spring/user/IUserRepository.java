package br.com.curso.spring.Curso.de.Spring.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;


public interface IUserRepository extends JpaRepository<UserModel, UUID> { 
    
    UserModel findByUserName(String userName);
}