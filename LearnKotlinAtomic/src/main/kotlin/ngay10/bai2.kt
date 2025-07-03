package org.example.ngay10

/*Yêu cầu:
Tạo enum class Status với các giá trị ON, OFF.
Viết hàm isActive() trong Status trả về true nếu là ON.
Trong main, gọi isActive() cho Status.ON, in "Status: result.".
Đầu ra:

Status: true.=
 */

enum class Status {
    ON, OFF;

    fun isActive() = this == ON
}

fun main() {
    val status = Status.ON
    println("Status: ${status.isActive()}.")
}

