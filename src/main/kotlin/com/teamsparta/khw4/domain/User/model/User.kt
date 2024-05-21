package com.teamsparta.khw4.domain.User.model

import com.teamsparta.khw4.domain.comment.model.Comment
import com.teamsparta.khw4.domain.task.model.Task
import jakarta.persistence.*
import java.sql.Timestamp



@Entity
@Table(name = "app_user")
class User(
    @Column(name = "email")
    val email: String = "",

    @Column(name = "password")
    val password: String = "",

    @Embedded
    var profile: Profile = Profile(),

    @Column(name = "created_date")
    val createdDate: Timestamp = Timestamp(System.currentTimeMillis()),

    @Column(name = "login_date")
    var loginDate: Timestamp = Timestamp(System.currentTimeMillis()),

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val tasks: MutableList<Task> = mutableListOf(),

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL])
    val comments: MutableList<Comment> = mutableListOf(),


    ) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}

