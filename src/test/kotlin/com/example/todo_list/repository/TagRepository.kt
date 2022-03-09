package com.example.todo_list.repository

import com.example.todo_list.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository : JpaRepository<Tag, Long> {}