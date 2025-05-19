package org.example.Ontap1_8

/* Bài 3 (Trung bình - Atoms 2.12, 2.8, 1.8)
Tạo hàm `getItemPrice(items: Map<String, Double>, name: String): String` trả về `"Price: price."` (price 2 chữ số thập phân).
- Dùng `try-catch` để trả về `"Price: Not found."` nếu `name` không tồn tại.
- Trong `main`, tạo `mapOf("Book" to 12.99, "Pen" to 1.49)`, gọi `getItemPrice` cho `"Book"` và `"Paper"`, in kết quả.
**Đầu ra**:
```
Price: 12.99.
Price: Not found.
 */

fun getItemPrice(items: Map<String, Double>, name: String): String {
    return try {
        val price = items[name]!!
        "Price %.2f.".format(price)
    } catch(e: Exception) {
        "Price: Not found."
    }
}

fun main() {
    val map = mapOf("Book" to 12.99, "Pen" to 1.49)
    println(getItemPrice(map, "Book"))
    println(getItemPrice(map, "Paper"))
}
