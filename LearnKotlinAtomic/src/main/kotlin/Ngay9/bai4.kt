package org.example.Ngay9

/*
Yêu cầu:
Viết hai hàm overloaded getValue:
Value(map: Map<String, Int>, key: String): Trả về "Value: value." hoặc "Value: Not found." nếu không có key.
getValue(map: Map<String, Int>, key: String, default: Int): Trả về "Value: value.", dùng default nếu không có key.
Trong main, tạo mapOf("A" to 1, "B" to 2), gọi cả hai hàm với key = "B" và key = "C" (dùng default = 0 cho hàm thứ hai), in kết quả.

Đầu ra:
Value: 2.
Value: Not found.
Value: 2.
Value: 0.

Gợi ý:
Dùng getOrDefault(key, defaultValue) (Atom 2.12).
 */

fun getValue(map: Map<String, Int>, key: String) =
    if (key in map)
        "Value: ${map[key]}."
    else
        "Value: Not found."


fun getValue(map: Map<String, Int>, key: String, default: Int) =
    if (key in map)
        "Value: ${map[key]}."
    else
        "Value: $default."

fun main() {
    val map = mapOf("A" to 1, "B" to 2)
    println(getValue(map, "B"))
    println(getValue(map, "C"))
    println(getValue(map, "B", 0))
    println(getValue(map, "C", 0))
}