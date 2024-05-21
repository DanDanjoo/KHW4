package com.teamsparta.khw4.domain.task.model

import com.teamsparta.khw4.domain.comment.model.Comment
import jakarta.persistence.*
import java.sql.Date
import java.time.LocalDateTime


@Entity
@Table(name = "task")
class Task(
    @Column(name = "title")
    var title: String = "",

    @Column(name = "description")
    var description: String? = null,

    @Column(name = "due_date")
    var dueDate: Date? = null,

    @Column(name = "completed")
    var completed: Boolean = false,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),
    //TODO CREATED_AT 할일 생성 일시
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now(),
    //TODO UPDATED_AT 할일 수정 일시
    @Column(name = "deleted_at")
    val deleted_at: LocalDateTime = LocalDateTime.now(),
    //TODO DELETED_AT 할일 삭제 일시

    @Column(name = "deleted_yn")
    var deletedYn: Boolean = false,
    //TODO DELETED_YN 삭제 여부를 표시함 - boolean 타입

    @OneToMany(mappedBy = "task", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    val comments: MutableList<Comment> = mutableListOf()



) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null


}

