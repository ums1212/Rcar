package org.komong.rcar.model

data class UserData(
    // 회원 번호
    val userIdx: Int,
    // 회원 아이디(이메일)
    val userEmail: String,
    // 회원 비밀번호
    val userPassword: String,
    // 회원 이름
    val userName: String,
    // 회원 전화번호
    val userPhoneNumber: String,
)
