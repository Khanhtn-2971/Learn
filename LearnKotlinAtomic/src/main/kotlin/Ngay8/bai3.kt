package org.example.Ngay8

//Bài 3 Tạo hàm `findPrice(prices: Map<String, Double>, item: String): String` trả về `"Item: price."`
//                                              (price là giá của `item` trong `prices`, 2 chữ số thập phân).
//- Dùng `try-catch` để trả về `"Item: Not found."` nếu `item` không có.
//- Trong `main`, tạo `mapOf("Pen" to 1.99, "Book" to 9.99)`, gọi `findPrice` cho `"Pen"` và `"Notebook"`, in kết quả.
//**Đầu ra**:
//```
//Item: 1.99.
//Item: Not found.
//```

fun findPrice(prices: Map<String, Double>, item: String): String {
    return try {
        "Item: %.2f.".format(prices.getValue(item))
    } catch(e:NoSuchElementException) {
        "Item: not found"
    }
}

fun main() {
    val prices = mapOf("Pen" to 1.99, "Book" to 9.99)
    println(findPrice(prices, "Pen"))      // Item: 1.99.
    println(findPrice(prices, "Notebook")) // Item: Not found.
}