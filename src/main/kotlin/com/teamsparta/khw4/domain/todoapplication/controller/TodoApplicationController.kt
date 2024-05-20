package com.teamsparta.khw4.domain.todoapplication.controller

import com.teamsparta.khw4.domain.todoapplication.dto.ApplyTaskRequest
import com.teamsparta.khw4.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.khw4.domain.todoapplication.dto.UpdateApplicationStatusRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/task/{taskId}/applications")
@RestController
class TodoApplicationController {

    @GetMapping
    fun getApplicationList(@PathVariable taskId: Long): ResponseEntity<List<TodoApplicationResponse>> {
        TODO()
    }
    @GetMapping("/{applicationId}")
    fun getApplication(
    @PathVariable taskId: Long,
    @PathVariable applicationId: Long
    ) : ResponseEntity<TodoApplicationResponse> {
        TODO()
    }

    @PostMapping
    fun applyTask(
        @PathVariable taskId: Long,
        applyTaskRequest: ApplyTaskRequest
    ): ResponseEntity<TodoApplicationResponse> {
        TODO()
    }

    @PatchMapping("/{applicationId}")
    fun updateApplicationStatus(
        @PathVariable taskId: Long,
        @PathVariable applicationId: Long,
        @RequestBody updateApplicationStatusRequest: UpdateApplicationStatusRequest
    ): ResponseEntity<TodoApplicationResponse> {
        TODO()
    }
}