package com.teamsparta.khw4.domain.task.service

import com.teamsparta.khw4.domain.comment.dto.AddCommentRequest
import com.teamsparta.khw4.domain.comment.dto.CommentResponse
import com.teamsparta.khw4.domain.comment.dto.UpdateCommentRequest
import com.teamsparta.khw4.domain.exception.ModelNotFoundException
import com.teamsparta.khw4.domain.task.dto.CreateTaskRequest
import com.teamsparta.khw4.domain.task.dto.TaskResponse
import com.teamsparta.khw4.domain.task.dto.UpdateTaskRequest
import com.teamsparta.khw4.domain.todoapplication.dto.ApplyTaskRequest
import com.teamsparta.khw4.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.khw4.domain.todoapplication.dto.UpdateApplicationStatusRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class TaskServiceImpl: TaskService {
    //TODO : DB에서 모든 TASK 목록을 조회하여 TaskResponse 목록으로 변환 후 반환
    override fun getAllTasksList(): List<TaskResponse> {
        TODO("Not yet implemented")
    }


    override fun getTaskById(taskId: Long): TaskResponse {
        // TODO : 만약 taskId에 해당하는 Task가 없다면 throw ModelNotFoundException
        // TODO : DB에서 ID기반으로 TASK를 가져와서 TaskResponse 변환 후 반환
        // TODO("Not yet implemented")
        throw ModelNotFoundException(modelName = "Task", id = 1L)
    }

    @Transactional
    override fun createTask(request: CreateTaskRequest): TaskResponse {
        // TODO : request를 Task라는 엔티티로 변환 후 DB에 저장
        TODO("Not yet implemented")
    }
    @Transactional
    override fun updateTask(taskId: Long, request: UpdateTaskRequest): TaskResponse {
        // TODO : 만약 taskId에 해당하는 Task가 없다면 thow ModelNotFoundException
        // TODO : DB에서 taskId에 해당하는 Task를 가져와서 request기반으로 업데이트 후 DB에 저장, 결과를 TaskResponse 변환 후 반환
        TODO("Not yet implemented")
    }
    @Transactional
    override fun deleteTask(taskId: Long) {
        // TODO : 만약 taskId에 해당하는 Task가 없다면 thow ModelNotFoundException
        // TODO : DB에서 taskId에 해당하는 Task를 삭제, 연관된 TaskApplication과 Comment도 모두 삭제
        TODO("Not yet implemented")
    }

    override fun getCommentList(taskId: Long): List<CommentResponse> {
        //TODO 만약 taskId에 해당하는 Task가 없다면 throw ModelNotFoundException
        //TODO DB에서 taskId에 해당하는 Task목록을 가져오고, 하위 comment들을 가져온 다음, commentResponse로 변환해서 반환
        TODO("Not yet implemented")
    }

    override fun getComment(taskId: Long, commentId: Long): CommentResponse {
        //TODO 만약 taskId, commentId에 해당하는 Comment가 없다면 throw ModelNotFoundException
        //TODO DB에서 taskId, commentId에 해당하는 comment를 가져와서 commentResponse로 변환 후 반환
        TODO("Not yet implemented")
    }
    @Transactional
    override fun addComment(taskId: Long, request: AddCommentRequest): CommentResponse {
        //TODO 만약 taskId에 해당하는 Task가 없다면 throw ModelNotFoundException
        //TODO DB에서 taskId에 해당하는 Task를 가져와서 Comment를 추가 후 DB에 저장, 결과들을 CommentResponse로 변환 후 반환
        TODO("Not yet implemented")
    }
    @Transactional
    override fun updateComment(taskId: Long, commentId: Long, request: UpdateCommentRequest): CommentResponse {
        //TODO 만약 taskId, commentId에 해당하는 Comment가 없다면 throw ModelNotFoundException
        /*TODO DB에서 taskId, commentId에 해당하는 Comment를 가져와서
        *   request로 업데이트 후 DB에 저장, 결과들을 CommentResponse로 변환 후 반환 */
        TODO("Not yet implemented")
    }
    @Transactional
    override fun removeComment(taskId: Long, commentId: Long) {
        //TODO 만약 taskId에 해당하는 Task가 없으면 throw ModelNotFoundException
        //TODO DB에서 taskId, commentId에 해당하는 Comment를 가져오고, 삭제
        TODO("Not yet implemented")
    }
    @Transactional
    override fun applyTask(taskId: Long, request: ApplyTaskRequest): TodoApplicationResponse {
        //TODO 만약 taskId에 해당하는 Task가 없다면 throw ModelNotFoundException
        TODO("Not yet implemented")
    }

    override fun getTodoApplication(taskId: Long, applicationId: Long): TodoApplicationResponse {
        //TODO 만약 taskId, applicationId에 해당하는 TodoApplication이 없다면 throw ModelNotFoundException
        //TODO DB에서 taskId, applicationId에 해당하는 TodoApplication을 가져와서 TodoApplicationResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getTodoApplicationList(taskId: Long): List<TodoApplicationResponse> {
        // TODO 만약 taskId에 해당하는 Task가 없다면 throw ModelNotFoundException
        // TODO DB에서 taskId에 해당하는 Task를 가져오고 하위 TodoApplication들을  TodoApplicationResponse로 변환 후 반환
        TODO("Not yet implemented")
    }
    @Transactional
    override fun updateTodoApplicationStatus(
        courseId: Long,
        applicationId: Long,
        request: UpdateApplicationStatusRequest
    ): TodoApplicationResponse {
        //TODO 만약 taskId, applicationId에 해당하는 TodoApplication이 없다면 throw ModelNotFoundException
        TODO("Not yet implemented")
    }

}