package br.com.curso.spring.Curso.de.Spring.task;

import java.time.LocalDateTime; // ✅ LocalDateTime, não LocalDate
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;




import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody TaskModel taskMoldel, HttpServletRequest request) {
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

    @GetMapping("/")
    public List<TaskModel> list(HttpServletRequest request) {
        var idUser = (UUID) request.getAttribute("idUser");
        var tasks = this.taskRepository.findByIdUser((UUID) request.getAttribute("idUser"));
        return tasks;
    }

    @PutMapping("/{id}")
    public TaskModel update(@RequestBody TaskModel taskModel, @PathVariable UUID id, HttpServletRequest request){
        var idUser = request.getAttribute("idUser");

        var task = this.taskRepository.findById(id).orElse( null);
        Utils.copyNonNullProperties(taskModel, task);

        return this.taskRepository.save(task); 

    }

}   