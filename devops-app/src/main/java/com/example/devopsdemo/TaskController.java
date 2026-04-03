package com.example.devopsdemo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class TaskController {

    private List<String> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public String addTask(@RequestBody String task) {
        tasks.add(task);
        return "Task added";
    }
}
