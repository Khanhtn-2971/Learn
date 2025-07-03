package org.example.Ontap1_8

/*### Bài 1 (Cơ bản - Atoms 1.8, 2.10)
Tạo hàm `formatNames(vararg names: String): String` trả về chuỗi `names` nối bởi ", ".
- Nếu rỗng, trả về `"No names."`.
- Trong `main`, gọi `formatNames("Alice", "Bob")` và `formatNames()`, in `"Result: result."`.
**Đầu ra**:
```
Result: Alice, Bob.
Result: No names.
```
 */

fun formatNames(vararg names: String): String {
    when{
        names.isEmpty() -> return "No name."
        else -> return names.joinToString(", ")
    }
}

fun main() {
    println("${formatNames("Alice", "Bob")}.")
    println(formatNames())
}

