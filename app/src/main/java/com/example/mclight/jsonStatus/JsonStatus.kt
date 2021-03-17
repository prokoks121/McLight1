package com.example.mclight.jsonStatus

object JsonStatus {


    data class Status(
            val brightness: Int,
            val color: List<Int>,
            val delay_ms: Int,
            val mode: Int
    ) {
        override fun toString(): String {
            return "Status(brightness=$brightness, color=$color, delay_ms=$delay_ms, mode=$mode)"
        }
    }
}