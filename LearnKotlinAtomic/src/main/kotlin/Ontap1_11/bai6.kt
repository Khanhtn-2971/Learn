package org.example.Ontap1_11

/*
🔂 Bài 6 – Lặp và Ranges (1.12, 1.13)
Viết hàm printEvenNumbers(start: Int, end: Int)
 in ra các số chẵn trong khoảng đó (bao gồm cả start và end), sử dụng for và in.
 */

fun printEvenNumbers(start: Int, end: Int) {
    for (i in start..end) {
        if (i % 2 == 0) println(i)
    }
}

fun main() {
    printEvenNumbers(1, 12)
}