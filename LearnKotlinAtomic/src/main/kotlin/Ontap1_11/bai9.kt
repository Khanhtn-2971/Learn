package org.example.Ontap1_11

/*
Bài 9 – Viết chương trình in danh sách tên học sinh (Tổng hợp 1.3, 2.2)
Tạo list List<String> gồm tên các học sinh. In ra từng tên trong danh sách bằng vòng lặp.
 */

fun main() {
    val list = listOf("A", "B", "C", "D")
    for(i in list) println(i)
}