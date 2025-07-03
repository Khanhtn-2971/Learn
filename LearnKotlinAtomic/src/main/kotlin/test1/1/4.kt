package test1.`1`

data class Book(val title: String, val author: String, val price: Double)

fun main() {
    val books = mapOf(
        "B001" to Book("Kotlin Basics", "Nguyễn Văn A", 29.99),
        "B002" to Book("Advanced Kotlin", "Trần Thị B", 39.99)
    )

    for((id, book) in books){
        val (title, author, price) = book
        println("Mã sách: $id, Tựa đề: $title, Tác giả: $author, Giá: $price")
    }
}