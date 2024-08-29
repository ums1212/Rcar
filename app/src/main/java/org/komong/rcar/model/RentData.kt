package org.komong.rcar.model

import java.util.Date

data class RentData(
    // 렌트날짜
    val rentDate: Date,
    // 유저정보
    val userInfo: UserData,
    // 차량정보
    val carInfo: CarData,
    // 렌트타입
    val rentType: String,
)
