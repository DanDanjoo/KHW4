package com.teamsparta.khw4.domain.comment.model

import com.teamsparta.khw4.domain.User.model.User
import com.teamsparta.khw4.domain.task.model.Task
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "comment")
class Comment(

    @Column(name = "content")
    var content : String? = null,

    @Column(name = "created_at")
    var created_at: LocalDateTime = LocalDateTime.now(),

    //TODO UPDATED_AT 댓글 수정 일시
    @Column(name = "updated_at")
    var updated_at: LocalDateTime = LocalDateTime.now(),

    //TODO DELETED_AT 댓글 삭제 일시
    @Column(name = "deleted_at")
    var deleted_at: LocalDateTime = LocalDateTime.now(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User = User(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    val task: Task = Task()

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null



}