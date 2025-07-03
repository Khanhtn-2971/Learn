package ngay15

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    for (i in list) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    if (4 in list) {
        println("Found 4")
    }
}