package com.example.todo_list.service

import com.example.todo_list.entity.Task
import com.example.todo_list.repository.TaskRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TaskService(private val taskRepository: TaskRepository) {
    fun findAll(): List<Task> = taskRepository.findAll()
    fun findById(id: Long): Optional<Task> = taskRepository.findById(id)
    fun save(task: Task) = taskRepository.save(task)
    fun delete(id: Long) = taskRepository.deleteById(id)
}