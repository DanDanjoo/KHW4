package com.teamsparta.khw4.domain.User.service

import com.teamsparta.khw4.domain.User.dto.SignUpRequest
import com.teamsparta.khw4.domain.User.dto.UpdateUserProfileRequest
import com.teamsparta.khw4.domain.User.dto.UserResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserServiceImpl : UserService {

    @Transactional
    override fun signUp(request: SignUpRequest): UserResponse {
        //TODO Email이 중복되는지 확인하고 중복되면 throw IllegalStateException
        //TODO request를 User로 변환 후 DB에 저장, 비밀번호 저장 시 암호화
        TODO("Not yet implemented")
    }
    @Transactional
    override fun updateUserProfile(userId: Long, request: UpdateUserProfileRequest): UserResponse {
        // TODO 만약 userId에 해당하는 User가 없다면 throw ModelNotFoundException
        // TODO DB에서 userId에 해당하는 User를 가져와서 updateUserProfileRequest로 업데이트 후 DB에 저장, 결과를 UserResponse로 변환 후 반환
        TODO("Not yet implemented")
    }


}