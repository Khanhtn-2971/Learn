package org.example.Ontap1_11

/*
Bài 4 – Dùng when kết hợp enum
Tạo enum class Status { SUCCESS, ERROR, LOADING }
Viết hàm:

fun handleStatus(status: Status): String
Trả về chuỗi tương ứng cho từng trạng thái.
 */

enum class Status { SUCCESS, ERROR, LOADING }

fun handleStatus(status: Status): String {
    return when (status) {
        Status.SUCCESS -> "SUCCESS"
        Status.ERROR -> "ERROR"
        Status.LOADING -> "LOADING"
    }
}
