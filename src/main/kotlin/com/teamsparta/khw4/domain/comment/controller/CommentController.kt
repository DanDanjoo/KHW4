package com.teamsparta.khw4.domain.comment.controller

import com.teamsparta.khw4.domain.comment.dto.AddCommentRequest
import com.teamsparta.khw4.domain.comment.dto.CommentResponse
import com.teamsparta.khw4.domain.comment.dto.UpdateCommentRequest
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest
import com.teamsparta.khw4.domain.task.service.TaskService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/task/{taskId}/comments")
@RestController
class CommentController(
    private val taskService: TaskService
) {

    @GetMapping
    fun getCommentList(@PathVariable taskId :Long): ResponseEntity<List<CommentResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.getCommentList(taskId))
    }

    @GetMapping("/{commentId}")
    fun getComment(@PathVariable taskId: Long, @PathVariable commentId:Long): ResponseEntity<CommentResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.getComment(taskId, commentId))
    }

    @PostMapping
    fun addComment(
        @PathVariable taskId: Long,
        @RequestBody addCommentRequest: AddCommentRequest
    ): ResponseEntity<CommentResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.addComment(taskId, addCommentRequest))

    }
    @PutMapping("/{commentId}")
    fun updateComment(
        @PathVariable taskId: Long,
        @PathVariable commentId: Long,
        @RequestBody updateCommentRequest: UpdateCommentRequest
    ): ResponseEntity<CommentResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.updateComment(taskId, commentId, updateCommentRequest))
    }
    @DeleteMapping("/{commentId}")
    fun removeComment(
        @PathVariable taskId: Long,
        @PathVariable commentId: Long,
        ): ResponseEntity<Unit> {
       return ResponseEntity
           .status(HttpStatus.NO_CONTENT)
           .build()

    }
}