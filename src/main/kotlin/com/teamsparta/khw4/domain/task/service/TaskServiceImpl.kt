package com.teamsparta.khw4.domain.task.service

import com.teamsparta.khw4.domain.task.dto.CreateTaskRequest
import com.teamsparta.khw4.domain.task.dto.TaskResponse
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest
import org.springframework.stereotype.Service


@Service
class TaskServiceImpl: TaskService {
    //TODO : DB에서 모든 TASK 목록을 조회하여 TaskResponse 목록으로 변환 후 반환
    override fun getAllTasksList(): List<TaskResponse> {
        TODO("Not yet implemented")
    }

    override fun getTaskById(taskId: Long): TaskResponse {
        // TODO : DB에서 ID기반으로 TASK를 가져와서 TaskResponse 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun createTask(request: CreateTaskRequest): TaskResponse {
        // TODO : request를 Task라는 엔티티로 변환 후 DB에 저장
        TODO("Not yet implemented")
    }

    override fun updateTask(taskId: Long, request: UpdateTaskRequest): TaskResponse {
        // TODO : DB에서 taskId에 해당하는 Task를 가져와서 request기반으로 업데이트 후 DB에 저장, 결과를 TaskResponse 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun deleteTask(taskId: Long) {
        // TODO : DB에서 taskId에 해당하는 Task를 삭제, 연관된 TaskApplication과 Comment도 모두 삭제
        TODO("Not yet implemented")
    }

}