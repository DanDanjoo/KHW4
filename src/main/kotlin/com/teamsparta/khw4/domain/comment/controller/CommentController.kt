package com.teamsparta.khw4.domain.comment.controller

import com.teamsparta.khw4.domain.comment.dto.AddCommentRequest
import com.teamsparta.khw4.domain.comment.dto.CommentResponse
import com.teamsparta.khw4.domain.comment.dto.UpdateCommentRequest
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/task/{taskId}/comments")
@RestController
class CommentController {

    @GetMapping
    fun getCommentList(@PathVariable taskId:Long): ResponseEntity<List<CommentResponse>> {
        TODO()
    }

    @GetMapping("/{commentId}")
    fun getComment(@PathVariable taskId: Long, @PathVariable commentId:Long): ResponseEntity<CommentResponse> {
        TODO()
    }

    @PostMapping
    fun addComment(
        @PathVariable taskId: Long,
        @RequestBody addCommentRequest: AddCommentRequest
    ): ResponseEntity<CommentResponse>{
        TODO()
    }
    @PutMapping("/{commentId}")
    fun updateComment(
        @PathVariable taskId: Long,
        @PathVariable commentId: Long,
        @RequestBody updateCommentRequest: UpdateCommentRequest
    ): ResponseEntity<CommentResponse> {
        TODO()
    }
    @DeleteMapping("/{commentId}")
    fun removeComment(
        @PathVariable taskId: Long,
        @PathVariable commentId: Long,
        ): ResponseEntity<Unit> {
        TODO()

    }
}