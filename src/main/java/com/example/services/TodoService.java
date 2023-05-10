package com.example.services;

import com.example.models.entities.Todo;
import com.example.models.repositories.TodoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> findByTitle(String title){
        return todoRepository.findByTitleContains(title);
    }

    public void deleteById(Long id) {  todoRepository.deleteById(id); }
}
