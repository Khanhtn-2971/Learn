package org.example.ngay10

/*Yêu cầu:
Viết hàm grade(score: Int) dùng when expression trả về chuỗi:
"Excellent" nếu score ≥ 90.
"Good" nếu score ∈ [70, 89].
"Pass" nếu score ∈ [50, 69].
"Fail" nếu score < 50.
Trong main, gọi hàm với score = 85, in "Grade: result.".

Đầu ra:
Grade: Good.
 */

fun grade(score: Int): String {
    return when {
        score >= 90 -> "Excellent"
        score in 70..89 -> "Good"
        score in 50..69 -> "Pass"
        else -> "Fail"
    }
}

fun main() {
    println("Grade: ${grade(85)}.")
}