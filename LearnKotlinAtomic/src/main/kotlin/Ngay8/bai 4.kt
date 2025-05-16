    package org.example.Ngay8

    //Tạo hàm `commonItems(list1: List<String>, list2: List<String>): Set<String>` trả về `Set` chứa các phần tử chung của `list1` và `list2`.
    //- Trong `main`, tạo `listOf("Apple", "Banana", "Orange")` và `listOf("Banana", "Grape", "Apple")`, gọi `commonItems`, in `"Common: set."` (set là chuỗi phần tử, cách nhau bởi ", ").
    //**Đầu ra**:
    //```
    //Common: Apple, Banana.
    //```


    fun commonItems(list1 :List<String>, list2 : List<String>): Set<String> {
        var set = mutableSetOf<String>()
        for(i in list1) {
            for (j in list2) {
                if(i == j)
                    set.add(i)
            }
        }
        return set
    }

    fun main() {
        val list1 = listOf("Apple", "Banana", "Orange")
        val list2 = listOf("Banana", "Grape", "Apple")
        println("Common: ${commonItems(list1, list2).joinToString(", ")}")
    }