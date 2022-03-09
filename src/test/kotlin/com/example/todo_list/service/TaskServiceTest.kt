package com.example.todo_list.service

import com.example.todo_list.entity.Task
import com.example.todo_list.repository.TaskRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
@DisplayName("TaskService")
internal class TaskServiceTest {
    @Autowired
    lateinit var taskService: TaskService

    @MockBean
    lateinit var mockTaskRepository: TaskRepository

    @Nested
    @DisplayName("getTask")
    inner class GetTask {
        @DisplayName("should return task data with user information when getTask function is called with task id")
        @Test
        fun getTask() {
            given(
                mockTaskRepository.save(
                    Task(
                        1,
                        "title",
                        "description"
                    )
                )
            )
                .willReturn(
                    Task(
                        1,
                        "title",
                        "description"
                    )
                )
            val actual = taskService.save(
                Task(
                    1,
                    "title",
                    "description"
                )
            )
            assertThat(1).isEqualTo(actual.id)
            assertThat("title").isEqualTo(actual.title)
            assertThat("description").isEqualTo(actual.description)
        }
    }
}