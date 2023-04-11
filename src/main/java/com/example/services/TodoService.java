package com.example.services;

import com.example.models.entities.Todo;
import com.example.models.repositories.TodoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo findById(Long id) {
        return todoRepository.findById(id).get();
    }
}
