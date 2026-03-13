package br.com.curso.spring.Curso.de.Spring.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public void creat(@RequestBody UserModel userModel){
        System.out.println(userModel.getName());
    }
    
}
