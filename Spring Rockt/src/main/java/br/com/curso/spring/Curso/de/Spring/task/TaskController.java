package br.com.curso.spring.Curso.de.Spring.task;

import java.time.LocalDateTime; // ✅ LocalDateTime, não LocalDate
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody TaskMoldel taskMoldel, HttpServletRequest request) {
        System.out.println("Chegou na controller de criação de tarefa" + request.getAttribute("idUser"));
        taskMoldel.setIdUser((UUID) request.getAttribute("idUser"));

        var currentDate = LocalDateTime.now();
        if (currentDate.isAfter(taskMoldel.getStartAt()) || currentDate.isAfter(taskMoldel.getEndAt())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A data de inicio deve ser maior que a atual");
        }

        if (taskMoldel.getStartAt().isAfter(taskMoldel.getEndAt())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("A data de inicio deve ser menor que a data de término");
        }

        var task = this.taskRepository.save(taskMoldel);
        return ResponseEntity.status(HttpStatus.OK).body(task);
    }
}