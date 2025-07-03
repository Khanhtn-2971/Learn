//Bài 1 (Trung bình - Atoms 1.6, 1.8, 1.9)
//Tạo hàm `calculateTotal(price: Double, quantity: Int): Double` trả về tổng tiền (`price * quantity`).
//- Trong `main`, gọi `calculateTotal(2.5, 3)` và `calculateTotal(1.99, 5)`, in `"Total: result."` (result là tổng tiền, 2 chữ số thập phân, dùng `String.format("%.2f", value)`).
//**Đầu ra**:
//```
//Total: 7.50.
//Total: 9.95.
//```

fun calculateTotal(price: Double, quantity: Int): Double {
    return price * quantity
}
fun main() {
    var resutl = calculateTotal(2.5, 3)
    println("Total: %.2f".format(resutl))
    resutl = calculateTotal(1.99, 5)
    println("Total: %.2f".format(resutl))

}