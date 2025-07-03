package org.example.Ontap1_11

/*
🔥 Bài 5 – Viết lại filterNotNull()
Tự viết extension function List<T?>.myFilterNotNull(): List<T> dùng filter và safe call.
 */

fun <T> List<T?>.myFilterNotNull(): List<T> {
    return this.filter { it != null }.map { it!! }
}
