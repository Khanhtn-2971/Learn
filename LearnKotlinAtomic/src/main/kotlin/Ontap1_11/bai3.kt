package org.example.Ontap1_11

/*
 Bài 3 – Hàm và Kiểu trả về (1.6, 1.9, 1.10)
Viết hàm isEven(n: Int): Boolean trả về true nếu n là số chẵn.
Gọi hàm với giá trị 4 và 5, in kết quả.
 */

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

fun main() {
    println(isEven(-4))
    println(isEven(5))
}


