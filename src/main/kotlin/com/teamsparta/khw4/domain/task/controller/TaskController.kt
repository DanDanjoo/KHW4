package com.teamsparta.khw4.domain.task.controller

import com.teamsparta.khw4.domain.exception.ModelNotFoundException
import com.teamsparta.khw4.domain.task.dto.CreateTaskRequest
import com.teamsparta.khw4.domain.task.dto.TaskResponse
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest
import com.teamsparta.khw4.domain.task.service.TaskService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/tasks")
@RestController
class TaskController (
    private val taskService: TaskService
){

    // 목록 조회
    @GetMapping()
    fun getTasks() : ResponseEntity<List<TaskResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.getAllTasksList())
    }

    // 단일 할 일 조회
    @GetMapping("/{taskId}")
    fun getTask(@PathVariable taskId: Long): ResponseEntity<TaskResponse> {
        return ResponseEntity.status(HttpStatus.OK)
            .body(taskService.getTaskById(taskId))
    }

    // 할 일 생성
    @PostMapping
    fun createTask(@RequestBody createTaskRequest: CreateTaskRequest): ResponseEntity<TaskResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(taskService.createTask(createTaskRequest))
    }

    @PutMapping("/{taskId}")
    fun updateTask(
        @PathVariable taskId: Long,
        @RequestBody updateTaskRequest: UpdateTaskRequest
    ): ResponseEntity<TaskResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.updateTask(taskId, updateTaskRequest))
    }

    @DeleteMapping("/{taskId}")
    fun deleteTask(@PathVariable taskId: Long): ResponseEntity<Unit> {
        taskService.deleteTask(taskId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }


}
