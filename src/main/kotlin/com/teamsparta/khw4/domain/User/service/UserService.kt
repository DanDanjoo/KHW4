package com.teamsparta.khw4.domain.User.service

import com.teamsparta.khw4.domain.User.dto.SignUpRequest
import com.teamsparta.khw4.domain.User.dto.UpdateUserProfileRequest
import com.teamsparta.khw4.domain.User.dto.UserResponse

interface UserService {
    fun signUp(request: SignUpRequest): UserResponse
    fun updateUserProfile(userId: Long, request: UpdateUserProfileRequest): UserResponse
}