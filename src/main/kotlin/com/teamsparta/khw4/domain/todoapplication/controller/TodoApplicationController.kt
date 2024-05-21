package com.teamsparta.khw4.domain.todoapplication.controller

import com.teamsparta.khw4.domain.task.service.TaskService
import com.teamsparta.khw4.domain.todoapplication.dto.ApplyTaskRequest
import com.teamsparta.khw4.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.khw4.domain.todoapplication.dto.UpdateApplicationStatusRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/task/{taskId}/applications")
@RestController
class TodoApplicationController(
    private val taskService: TaskService

) {

    @PostMapping
    fun applyTask(
        @PathVariable taskId: Long,
        applyTaskRequest: ApplyTaskRequest
    ): ResponseEntity<TodoApplicationResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(taskService.applyTask(taskId, applyTaskRequest))
    }

    @GetMapping
    fun getApplicationList(@PathVariable taskId: Long): ResponseEntity<List<TodoApplicationResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.getTodoApplicationList(taskId))
    }

    @GetMapping("/{applicationId}")
    fun getApplication(
    @PathVariable taskId: Long,
    @PathVariable applicationId: Long
    ) : ResponseEntity<TodoApplicationResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.getTodoApplication(taskId, applicationId))
    }

    @PatchMapping("/{applicationId}")
    fun updateApplicationStatus(
        @PathVariable taskId: Long,
        @PathVariable applicationId: Long,
        @RequestBody updateApplicationStatusRequest: UpdateApplicationStatusRequest
    ): ResponseEntity<TodoApplicationResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(
                taskService.updateTodoApplicationStatus(
                    taskId,
                    applicationId,
                    updateApplicationStatusRequest

                )
            )
    }
}