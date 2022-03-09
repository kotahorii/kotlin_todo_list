package com.example.todo_list.controller

import com.example.todo_list.entity.Task
import com.example.todo_list.service.TaskService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/tasks")
class TaskController(private val taskService: TaskService) {
    @GetMapping("")
    fun findAll(): List<Task> {
        return taskService.findAll()
    }

    @PostMapping("")
    fun create(@RequestBody task: Task): Task {
        taskService.save(task)
        return task
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): Optional<Task> {
        return taskService.findById(id)
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody task: Task): Task {
        taskService.save(task.copy(id = id))
        return task.copy(id = id)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): String {
        taskService.delete(id)
        return "delete complete"
    }
}