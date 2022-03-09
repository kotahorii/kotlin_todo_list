package com.example.todo_list.service

import com.example.todo_list.entity.Tag
import com.example.todo_list.repository.TagRepository

class TagService(private val tagRepository: TagRepository) {
    fun findAll(): List<Tag> = tagRepository.findAll()
    fun findById(id: Long) = tagRepository.findById(id)
    fun save(tag: Tag) = tagRepository.save(tag)
    fun delete(id: Long) = tagRepository.deleteById(id)
}