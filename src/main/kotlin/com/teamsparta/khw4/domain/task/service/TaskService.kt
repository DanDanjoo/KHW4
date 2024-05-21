package com.teamsparta.khw4.domain.task.service

import com.teamsparta.khw4.domain.comment.dto.AddCommentRequest
import com.teamsparta.khw4.domain.comment.dto.CommentResponse
import com.teamsparta.khw4.domain.comment.dto.UpdateCommentRequest
import com.teamsparta.khw4.domain.task.dto.CreateTaskRequest
import com.teamsparta.khw4.domain.task.dto.TaskResponse
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest
import com.teamsparta.khw4.domain.todoapplication.dto.ApplyTaskRequest
import com.teamsparta.khw4.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.khw4.domain.todoapplication.dto.UpdateApplicationStatusRequest

interface TaskService {

    fun getAllTasksList(): List<TaskResponse>

    fun getTaskById(taskId: Long): TaskResponse

    fun createTask(request: CreateTaskRequest) : TaskResponse

    fun updateTask(taskId: Long, request: UpdateTaskRequest) : TaskResponse

    fun deleteTask(taskId: Long)

    fun getCommentList(taskId: Long): List<CommentResponse>

    fun getComment(taskId: Long, commentId: Long): CommentResponse

    fun addComment(taskId: Long, request: AddCommentRequest) : CommentResponse

    fun updateComment(
        taskId: Long,
        commentId: Long,
        request: UpdateCommentRequest
    ): CommentResponse

    fun removeComment(taskId: Long, commentId: Long)

    fun applyTask(taskId: Long, request: ApplyTaskRequest): TodoApplicationResponse

    fun getTodoApplication(
        taskId: Long,
        applicationId: Long
    ): TodoApplicationResponse

    fun getTodoApplicationList(taskId: Long): List<TodoApplicationResponse>

    fun updateTodoApplicationStatus(
        courseId: Long,
        applicationId: Long,
        request: UpdateApplicationStatusRequest
    ): TodoApplicationResponse
}