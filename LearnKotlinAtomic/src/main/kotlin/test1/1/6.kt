package test1.`1`


fun String.isValidName(): Boolean = this.all { it.isLetter() || it.isWhitespace() }

val String.wordCount: Int
    get() = this.split(" ").size

fun main() {
    val name = "Nguyen Van An"
    println("Tên '$name' hợp lệ: ${name.isValidName()}")
    println("Số từ trong '$name': ${name.wordCount}")
}