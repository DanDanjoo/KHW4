package com.teamsparta.khw4.domain.todoapplication.dto

import com.teamsparta.khw4.domain.User.dto.UserResponse
import com.teamsparta.khw4.domain.task.dto.TaskResponse

data class TodoApplicationResponse (
    val id : Long,
    val task : TaskResponse,
    val user: UserResponse,
)