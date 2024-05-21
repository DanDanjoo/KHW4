package com.teamsparta.khw4.domain.User.controller

import com.teamsparta.khw4.domain.User.dto.SignUpRequest
import com.teamsparta.khw4.domain.User.dto.UpdateUserProfileRequest
import com.teamsparta.khw4.domain.User.dto.UserResponse
import com.teamsparta.khw4.domain.User.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController (
    private val userService: UserService

) {

    @PostMapping("/signup")
    fun signUp(@RequestBody signUpRequest: SignUpRequest): ResponseEntity<UserResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(userService.signUp(signUpRequest))
    }

    @PutMapping("/users/{userId}/profile")
    fun updateUserProfile(
        @PathVariable userId: Long,
        @RequestBody updateUserProfileRequest: UpdateUserProfileRequest
    ): ResponseEntity<UserResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(userService.updateUserProfile(userId, updateUserProfileRequest))
    }
}