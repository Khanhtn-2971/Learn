package org.example.ngay10

/*Bài 4 (Trung bình - Atoms 3.4, 3.5)
Yêu cầu:
Tạo enum class Category với FOOD, CLOTHING, ELECTRONICS.
Viết hàm describeCategory(category: Category) dùng when expression trả về:
"Edible" cho FOOD.
"Wearable" cho CLOTHING.
"Tech" cho ELECTRONICS.
Trong main, tạo mapOf("Apple" to Category.FOOD, "Shirt" to Category.CLOTHING),
    dùng destructuring trong forEach để in "Item: name is description.".

Đầu ra:
Item: Apple is Edible.
Item: Shirt is Wearable.

 */

enum class Category {
    FOOD, CLOTHING, ELECTRONICS;
}

fun describeCategory(category: Category): String {
    return when (category) {
        Category.FOOD -> "Edible"
        Category.CLOTHING -> "Wearable"
        Category.ELECTRONICS -> "Tech"
    }
}

fun main() {
    val map = mapOf("Apple" to Category.FOOD, "Shirt" to Category.CLOTHING)
    map.forEach { (name, category) ->
        println("Item: $name is ${describeCategory(category)}.")
    }
}
