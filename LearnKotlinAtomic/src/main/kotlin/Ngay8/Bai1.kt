package org.example.Ngay8

//### Bài 1 (Cơ bản - Atom 2.10, 1.8)
//Tạo hàm `listNames(vararg names: String): String` trả về chuỗi các `names` nối bởi ", ".
//- Nếu không có tên, trả về `"Empty."`.
//- Trong `main`, gọi `listNames("Kotlin", "Java")` và `listNames()`, in `"Names: result."`.
//**Đầu ra**:
//```
//Names: Kotlin, Java.
//Names: Empty.
//```

fun listNames(vararg names: String): String =
    if(names.isEmpty()) "Empty."
    else names.joinToString(", ")

fun main() {
    println("Names: ${listNames("Kotlin", "Java")}.")
    println("Names: ${listNames()}")
}
