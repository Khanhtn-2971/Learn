package org.example.Ontap1_11


/*
Viết một hàm fun sayHello(name: String) in ra:
php-template
Hello, <name>!
→ Sử dụng String templates ($name) và gọi hàm với giá trị "Kotlin".
 */

fun sayHello(name: String) {
    println("Hello, $name!")
}

fun main() {
    sayHello("Kotlin")
}