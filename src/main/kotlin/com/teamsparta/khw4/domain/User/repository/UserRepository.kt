package com.teamsparta.khw4.domain.User.repository

import com.teamsparta.khw4.domain.User.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
    fun existsByEmail(email: String): Boolean


}