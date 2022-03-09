package com.example.todo_list.controller

import com.example.todo_list.entity.Tag
import com.example.todo_list.service.TagService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/tags")
class TagController(private val tagService: TagService) {
    @GetMapping("")
    fun findAll(): List<Tag> {
        return tagService.findAll()
    }

    @PostMapping("")
    fun create(@RequestBody tag: Tag): Tag {
        tagService.save(tag)
        return tag
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): Optional<Tag> {
        return tagService.findById(id)
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody tag: Tag): Tag {
        tagService.save(tag.copy(id = id))
        return tag.copy(id = id)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): String {
        tagService.delete(id)
        return "delete complete"
    }
}