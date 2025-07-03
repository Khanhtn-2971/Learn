package org.example.Ngay8

//Tạo lớp `Store` với:
//- Thuộc tính `private var inventory: MutableMap<String, Int>` (mặc định `mutableMapOf()`).
//- Property `public var totalItems: Int` với getter tính tổng số lượng từ `inventory.values`.
//- Hàm `public fun addStock(name: String, quantity: Int)`: Thêm hoặc cập nhật `name` với `quantity` vào `inventory` nếu `quantity > 0`.
//- Trong `main`, tạo `Store`, gọi `addStock("Laptop", 10)`, `addStock("Mouse", 20)`,
// in `"Total: totalItems."`, gọi `addStock("Laptop", -5)`, in `"Total: totalItems."`.
//**Đầu ra**:
//```
//Total: 30.
//Total: 30.

class Store {
    private var inventory: MutableMap<String, Int> = mutableMapOf()
    var totalItems: Int
        get() = inventory.values.sum()
        set(_){}

    fun addStock(name: String, quantity: Int) {
        if(quantity > 0) {
            inventory.put(name,quantity)
        }
    }
}

fun main() {
    var store = Store()
    store.addStock("Laptop", 10)
    store.addStock("Mouse", 20)
    println("Total: ${store.totalItems}.")
    store.addStock("Laptop", -5)
    println("Total: ${store.totalItems}.")
}