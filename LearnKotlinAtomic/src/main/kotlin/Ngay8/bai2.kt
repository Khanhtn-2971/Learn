package org.example.Ngay8

//### Bài 2 (Cơ bản - Atom 2.11, 1.8)
//Tạo hàm `createUniqueSet(items: List<String>): Set<String>` trả về `Set` chứa các phần tử duy nhất từ `items`.
//- Trong `main`, tạo `listOf("Red", "Blue", "Red")`, gọi `createUniqueSet`, in `"Colors: set."` (set là chuỗi phần tử, cách nhau bởi ", ").
//**Đầu ra**:
//```
//Colors: Red, Blue.
//```

fun createUniqueSet( items: List<String>): Set<String> {
    val sets = mutableSetOf<String>()
    for(i in items) {
        sets.add("$i")
    }
    return sets
}

fun main() {
    val list = listOf("Red", "Blue", "Red")
    createUniqueSet(list)
    println("Colors: ${createUniqueSet(list).joinToString(", ")}")
}