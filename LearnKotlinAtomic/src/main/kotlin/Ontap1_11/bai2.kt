package org.example.Ontap1_11

/*
Tạo một biến temperature kiểu Double, dùng var, và thay đổi giá trị của nó.
Tạo một hằng số language kiểu String dùng val.

In ra nội dung:
The temperature is 28.5°C.
The language is Kotlin.
 */

fun main() {
    var temperature: Double = 10.0
    temperature = 28.5
    val language: String = "Kotlin"

    println("The temperature is $temperature°C.")
    println("The language is $language.")
}