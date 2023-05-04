package com.example.controllers.api;

import com.example.models.entities.Todo;
import com.example.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoApiController {
    @Autowired
    private TodoService todoService;

    @GetMapping()
    public Iterable<Todo> index() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public Todo show(@PathVariable Long id) {
        return todoService.findById(id);
    }

    @PostMapping()
    public Todo store(@RequestBody Todo todo) {
        return todoService.create(todo);
    }
}
