package org.example.Ontap1_10.shop

import kotlin.time.times

/*
Yêu cầu:
Viết hàm filterScores(scores: List<Int>) dùng when expression và filter trả về List chứa các số trong [50, 100].
Trong main, tạo listOf(30, 60, 120), gọi hàm, in "Valid scores: result." (dùng joinToString).
Đầu ra:

Valid scores: 60.
 */

fun filterScore(scores: List<Int>): List<Int> {
    return scores.filter {
        when {
            it in 50..100 -> true
            else -> false
        }
    }
}

fun main() {
    val list = listOf(30, 60, 120)
    println("Valid scores: ${filterScore(list).joinToString()}.")
}