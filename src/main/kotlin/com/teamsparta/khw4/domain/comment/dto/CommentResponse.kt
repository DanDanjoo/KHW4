package com.teamsparta.khw4.domain.comment.dto

data class CommentResponse (
    val id : Long,
    val content : String,
    val deletedYn : Boolean,
)
