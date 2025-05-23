package org.example.Ontap1_10

/*
Yêu cầu:
Tạo enum class Category với ELECTRONICS, BOOKS.
Tạo data class Sale(val category: Category, val item: String, val amount: Double).
Viết hàm analyzeSales(sales: List<S sales: List<Sale>, minAmount: Double = 0.0) dùng groupBy, sumOf, và filter trả về Map<Category, Double> chứa tổng amount của các giao dịch có amount > minAmount.
Trong main, tạo listOf(Sale(Category.ELECTRONICS, "Phone", 500.0), Sale(Category.BOOKS, "Kotlin", 30.0), Sale(Category.ELECTRONICS, "Laptop", 1200.0)), gọi hàm với minAmount = 100.0, dùng values và destructuring để in "Category: category, Total: total.".
Xử lý exception nếu danh sách rỗng, trả về mapOf().
Đầu ra:
Category: ELECTRONICS, Total: 1700.0.
 */

enum class Category{
    ELECTRONICS, BOOKS
}

data class Sale(val category: Category, val item: String, val amount: Double)

fun analyzeSales(sales: List<S sale: List<Sale>)