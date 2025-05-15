package org.example.Ngay7

//### Bài 5 (Nâng cao - Atoms 1.7, 2.4, 2.8, 2.9)
//Tạo lớp `Cart` với primary constructor nhận `id: Int` và `products: List<String>`.
//- Thuộc tính `private var total: Double` (mặc định `0.0`).
//- Hàm `public fun addPrice(amount: Double)`: Thêm `amount` vào `total` nếu `amount > 0`.
//- Hàm `public fun summary(): String`: Trả về `"Cart id: products products, total Total."` (products là `products.size`, Total là `total` với 2 chữ số thập phân).
//- Trong `main`, tạo `Cart(1, listOf("Laptop", "Mouse"))`, gọi `addPrice(999.99)`, in `summary()`.
//      Dùng `try-catch` để xử lý lỗi nếu `products[2]` được truy cập, in `"Error: No such product."`, sau đó in `summary()` lại.
//**Đầu ra**:
//```
//Cart 1: 2 products, total 999.99.
//Error: No such product.
//Cart 1: 2 products, total 999.99.
//```


class Cart(val id: Int,val products: List<String>) {
    private var total: Double = 0.0
    fun addPrice(amount: Double) {
        if(amount > 0) {
            total += amount
        }
    }
    fun summary(): String = "Cart $id: ${products.size} products, total %.2f.".format(total)
}

fun main() {
    val car1 = Cart(1, listOf("Laptop", "Mouse"))
    car1.addPrice(999.99)
    println(car1.summary())
    try {
        car1.products[2]
    }
    catch (e: Exception){
        println("Error: No such product.")
    }
    println(car1.summary())

}