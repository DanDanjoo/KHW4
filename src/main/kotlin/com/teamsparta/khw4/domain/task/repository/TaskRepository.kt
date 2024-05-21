package com.teamsparta.khw4.domain.task.repository

import com.teamsparta.khw4.domain.task.model.Task
import org.springframework.data.jpa.repository.JpaRepository



interface TaskRepository: JpaRepository<Task, Long> {
}
