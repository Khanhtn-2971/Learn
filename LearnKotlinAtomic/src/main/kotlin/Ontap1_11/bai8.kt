package org.example.Ontap1_11

/*
Tạo class Studen có:
thuộc tính name: String, age: Int
constructor chính
in thông tin học sinh bằng method printInfo()
 */

class Studen(var name: String, var age: Int) {
    fun printInfo() {
        println("$name : $age")
    }
}

fun main() {
    var studen = Studen("F", 12)
    studen.printInfo()
}