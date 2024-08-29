package org.komong.rcar.model

data class CarData(
    // 차량 번호
    val carIdx: Int,
    // 차량 모델
    val carModel: String,
    // 차종
    val carType: String,
    // 좌석
    val carSeats: Int,
    // 엔진 타입
    val engineType: String,
    // 렌트 비용
    val rentFee: Int,
    // 렌트 여부
    val rentState: Boolean,
    // 고장 여부
    val malfunctionState: Boolean,
)