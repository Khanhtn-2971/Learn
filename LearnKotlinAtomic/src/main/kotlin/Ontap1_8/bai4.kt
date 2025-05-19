package org.example.Ontap1_8

/*Bài 4 (Trung bình - Atoms 2.11, 2.9, 1.13)
Tạo hàm `findCommon(list1: List<String>, list2: List<String>): String`
trả về chuỗi các phần tử chung của `list1` và `list2`, nối bởi ", ".
- Nếu không có phần tử chung, trả về `"None."`.
- Trong `main`, tạo `listOf("Cat", "Dog", "Bird")` và `listOf("Dog", "Fish", "Cat")`, gọi `findCommon`, in `"Common: result."`.
**Đầu ra**:
```
Common: Cat, Dog.
```

 */

fun findCommon(list1: List<String>, list2: List<String>): String {
     val common = list1.intersect(list2)
    return if(!common.isEmpty()) {
        common.joinToString(", ")
    }
    else {
        "None"
    }
}

fun main() {
    val list1 = listOf("Cat", "Dog", "Bird")
    val list2 = listOf("Dog", "Fish", "Cat")
    println("Common: ${findCommon(list1, list2)}.")
}