package org.example.Ngay7

//Bài 2 (Trung bình - Atoms 1.12, 2.2, 2.9)
//Tạo lớp `Book` với thuộc tính `val title: String`.
//- Trong `main`, tạo `listOf(Book("Kotlin"), Book("Java"))`.
//- Dùng vòng lặp `for` để in `"Book: title."` cho từng phần tử.
//**Đầu ra**:
//```
//Book: Kotlin.
//Book: Java.
//```

class Book(val title: String)

fun main() {
    val list = listOf(Book("Kotlin"), Book("Java"))
    for(i in list) {
        println("Book: ${i.title}")
    }
}