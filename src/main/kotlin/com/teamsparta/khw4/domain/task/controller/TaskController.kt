package com.teamsparta.khw4.domain.task.controller

import com.teamsparta.khw4.domain.task.dto.CreateTaskRequest
import com.teamsparta.khw4.domain.task.dto.TaskResponse
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/tasks")
@RestController
class TaskController {

    // 목록 조회
    @GetMapping()
    fun getTasks() : ResponseEntity<List<TaskResponse>> {
        TODO()
    }
    // 단일 할 일 조회
    @GetMapping("/{taskId}")
    fun getTask(@PathVariable taskId: Long): ResponseEntity<TaskResponse> {
        TODO()

    }
    // 할 일 생성
    @PostMapping
    fun createTask(@RequestBody createTaskRequest: CreateTaskRequest): ResponseEntity<TaskResponse> {
        TODO()
    }

    @PutMapping("/{taskId}")
    fun updateTask(@PathVariable taskId: Long, @RequestBody updateTaskRequest: UpdateTaskRequest): ResponseEntity<TaskResponse> {
        TODO()
    }

    @DeleteMapping("/{taskId}")
    fun deleteTask(@PathVariable taskId: Long) {
        TODO()
    }

}
