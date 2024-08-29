package org.komong.rcar.model

import java.time.LocalDateTime
import java.util.Date

data class ReturnData(
    // 반환 날짜
    val returnDate: Date,
    // 회원 정보
    val userInfo: UserData,
    // 차량 정보
    val carInfo: CarData,
    // 렌트 타입
    val rentType: String,
    // 렌트 시간
    val rentTime: LocalDateTime,
    // 이동 거리
    val rentDistance: Float,
    // 총 비용
    val totalPrice: Int,
)
