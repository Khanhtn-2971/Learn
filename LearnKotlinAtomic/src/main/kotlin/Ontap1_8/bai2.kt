package org.example.Ontap1_8

/* Bài 2 (Cơ bản - Atoms 2.11, 1.12, 1.8)
Tạo hàm `uniqueColors(colors: List<String>): String` trả về chuỗi các màu duy nhất từ `colors`, nối bởi ", ".
- Trong `main`, tạo `listOf("Red", "Blue", "Red", "Green")`, gọi `uniqueColors`, in `"Colors: result."`.
**Đầu ra**:
```
Colors: Red, Blue, Green.
```
 */

fun uniqueColors(colors: List<String>): String {
    return colors.toSet().joinToString(", ")
}

fun main() {
    val list = listOf("Red", "Blue", "Red", "Green")
    println("Colors: ${uniqueColors(list)}.")
}