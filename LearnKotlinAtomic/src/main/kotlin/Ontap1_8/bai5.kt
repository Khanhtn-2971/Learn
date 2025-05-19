package org.example.Ontap1_8

/*Bài 5 (Nâng cao - Atoms 2.2, 2.12, 2.13, 2.8)
Tạo lớp `Inventory` với:
- Thuộc tính `private var stock: MutableMap<String, Int> = mutableMapOf()`.
- Property `public var totalStock: Int = 0` với getter tính tổng `stock.values`.
- Hàm `public fun addItems(vararg items: Pair<String, Int>)`: Cộng dồn số lượng cho mỗi `item` nếu số lượng `> 0`.
- Hàm `public fun getStock(name: String): Int` trả về số lượng của `name`, dùng `try-catch` để ném `Exception("Item not found")` nếu không tồn tại.
- Trong `main`, tạo `Inventory`, gọi `addItems("Laptop" to 5, "Mouse" to 10)`, in `"Total: totalStock."`, gọi `getStock("Laptop")` và `getStock("Tablet")`, in `"Stock: result."` hoặc `"Error: Item not found."`.
**Đầu ra**:
```
Total: 15.
Stock: 5.
Error: Item not found.

```
 */
fun main() {
    val inventory = Inventory()
    inventory.addItems("Laptop" to 5, "Mouse" to 10)
    println("Total: ${inventory.totalStock}.")
    try {
        val result = inventory.getStock("Laptop")
        println("Stock: $result.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    try {
        val result = inventory.getStock("Tablet")
        println("Stock: $result.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
class Inventory {
    private var stock: MutableMap<String, Int> = mutableMapOf()
    var totalStock: Int = 0
        get() = stock.values.sum()
    fun addItems(vararg items: Pair<String, Int>) {
        for ((name, quantity) in items) {
            if (quantity > 0) {
                    stock[name] = stock.getOrDefault(name, 0) + quantity
            }
        }
    }
    fun getStock(name: String): Int {
        return try{
            stock[name] ?: throw Exception("Item not found.")
        } catch(e: Exception) {
            throw e
        }
    }
}