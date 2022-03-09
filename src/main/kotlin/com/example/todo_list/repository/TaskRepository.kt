package com.example.todo_list.repository

import com.example.todo_list.entity.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, Long> {}