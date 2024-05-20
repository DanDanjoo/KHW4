package com.teamsparta.khw4.domain.task.dto

data class CreateTaskRequest(
    val title: String,
    val description: String?,
    val dueDate: Long,
)
