package com.teamsparta.khw4.domain.task.dto

data class TaskResponse(
    val id : Long,
    val title : String,
    val description : String?,
    val dueDate : Long,
    val completed : Boolean,
)
