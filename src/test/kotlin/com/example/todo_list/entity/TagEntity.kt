package com.example.todo_list.entity

import javax.persistence.*

@Entity
data class Tag(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,

    @ManyToOne
    val task: Task
)