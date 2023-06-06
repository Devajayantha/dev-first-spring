package com.example.controllers.api;

import com.example.models.entities.Todo;
import com.example.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoApiController {
    @Autowired
    private TodoService todoService;

    @GetMapping()
    public ResponseEntity<List<Todo>> index() {
        List<Todo> todos = todoService.findAll();

        if (todos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    @PostMapping()
    public Todo store(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @GetMapping("/search")
    public Iterable<Todo> search(@RequestParam String title) {
        System.out.println(title);
        return todoService.findByTitle(title);
    }

    @GetMapping("/{id}")
    public Todo show(@PathVariable Long id) {
        return todoService.findById(id);
    }

    @PatchMapping("/{id}")
    public Todo update(@RequestBody Todo todo) {
        return todoService.save(todo);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        todoService.deleteById(id);

        return String.format("Deleted todo with id: %d", id);
    }
}
