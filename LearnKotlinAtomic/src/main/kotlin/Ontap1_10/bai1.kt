package org.example.Ontap1_10
/*
Yêu cầu:
Viết hàm welcome(name: String) trả về chuỗi "Welcome, name!" dùng string template.
Viết extension function String.capitalizeWords() trả về chuỗi với mỗi từ viết hoa ký tự đầu (dùng split, map, joinToString).
Trong main, dùng val để lưu name = "kotlin course", gọi capitalizeWords rồi welcome, in "Result: result.".
Đầu ra:
Result: Welcome, Kotlin Course!.
 */

fun welcome(name: String): String {
    return "Welcome, $name!"
}

fun String.capitalizeWords(): String {
    val words = this.split(" ")
    var capitalizedWords = mutableListOf<String>()
    for (i in words) {
        capitalizedWords.add(i[0].uppercaseChar() + i.substring(1))
    }
    return capitalizedWords.joinToString(" ")

}

fun main() {
    val originalName = "kotlin course"
    val capitalizedName = originalName.capitalizeWords()
    println("Result: ${welcome(capitalizedName)}.")
}