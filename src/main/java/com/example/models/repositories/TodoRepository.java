package com.example.models.repositories;

import com.example.models.entities.Todo;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findByTitleContains(String title);
}
