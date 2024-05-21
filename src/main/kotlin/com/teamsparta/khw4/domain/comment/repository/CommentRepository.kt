package com.teamsparta.khw4.domain.comment.repository

import com.teamsparta.khw4.domain.comment.model.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository: JpaRepository<Comment, Long> {
}