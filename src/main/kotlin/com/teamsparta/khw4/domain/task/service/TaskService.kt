package com.teamsparta.khw4.domain.task.service

import com.teamsparta.khw4.domain.task.dto.CreateTaskRequest
import com.teamsparta.khw4.domain.task.dto.TaskResponse
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest

interface TaskService {

    fun getAllTasksList(): List<TaskResponse>

    fun getTaskById(taskId: Long): TaskResponse

    fun createTask(request: CreateTaskRequest) : TaskResponse

    fun updateTask(taskId: Long, request: UpdateTaskRequest) : TaskResponse

    fun deleteTask(taskId: Long)
}