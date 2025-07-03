package org.example.Ontap1_11

/*
 Bài 1 – Extension function: capitalizeFirst()
Viết extension function cho String? có tên capitalizeFirst():

fun String?.capitalizeFirst(): String
Nếu chuỗi null hoặc rỗng, trả về "".
Nếu không, viết hoa chữ cái đầu tiên.
 */

fun String?.capitalizeFirst(): String {
    if (this == null || this.isBlank()) return ""
    val s = this.trim()
    return s[0].uppercaseChar() + s.substring(1)
}
