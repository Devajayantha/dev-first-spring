package com.example.models.repositories;

import com.example.models.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    // ...
}
