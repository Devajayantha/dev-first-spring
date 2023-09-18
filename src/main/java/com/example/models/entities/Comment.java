package com.example.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String author;
    private Long todoId;

    public Comment() {
    }

    public Comment(String content, String author, Long todoId) {
        this.content = content;
        this.author = author;
        this.todoId = todoId;
    }

    public Comment(Long id, String content, String author, Long todoId) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.todoId = todoId;
    }

    public Comment(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public Comment(Long id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    @ManyToOne
    @JoinColumn(name = "todo_id")
    private Todo todo;

    // Getters and setters ...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTodoId() {
        return todoId;
    }

    public void setTodoId(Long todoId) {
        this.todoId = todoId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
