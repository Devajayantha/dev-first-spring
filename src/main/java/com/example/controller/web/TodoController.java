package com.example.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/todo")
public class TodoController {
    @GetMapping
    public String index() {
        return "todo/index";
    }

    @RestController
    @RequestMapping("/api/todo")
    public static class TestController {
        @GetMapping("/")
        public String index(@RequestParam(value = "myName", defaultValue = "World") String name) {
            return String.format("Hello %s!", name);
        }
    }
}
