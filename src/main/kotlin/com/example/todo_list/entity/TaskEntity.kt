package com.example.todo_list.entity

import javax.persistence.*

@Entity
data class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val title: String,
    val description: String,

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "task")
    private val tag: MutableList<Tag>? = null,
)