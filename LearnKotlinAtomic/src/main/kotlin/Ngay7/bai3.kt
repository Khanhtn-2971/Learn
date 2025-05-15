package org.example.Ngay7

//### Bài 3 (Trung bình - Atoms 1.13, 2.8, 2.9)
//Tạo hàm `accessItem(list: List<String>, index: Int): String` trả về phần tử tại `index` trong `list`.
//- Dùng `try-catch` để trả về `"Error: Invalid index."` nếu truy cập ngoài giới hạn.
//- Trong `main`, tạo `listOf("Red", "Blue")`, gọi `accessItem(list, 0)` và `accessItem(list, 2)`, in kết quả.
//**Đầu ra**:
//```
//Red
//Error:


fun accessItem(list: List<String>, index: Int): String {
    return try {
        list[index]
    } catch (e: Exception) {
        "Error: Invalid index."
    }
}


fun main() {
    val list = listOf("Red", "Blue")
    println(accessItem(list, 0))
    println(accessItem(list, 2))

}
