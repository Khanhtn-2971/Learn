fun String?.safeLength(): Int = this?.length ?: -1

val String.isPalindrome: Boolean
    get() = this.filter{it.isLetterOrDigit()}.lowercase().reversed() == this.filter{it.isLetterOrDigit()}.lowercase()


//Viết hàm generic maxOrDefault nhận một danh sách các phần tử Comparable<T> và một giá trị mặc định.
// Trả về phần tử lớn nhất nếu có, hoặc giá trị mặc định nếu danh sách rỗng.

fun <T: Comparable<T>> maxOrDefault(list: List<T>, defaultValue: T): T {
    if (list.isEmpty()) return defaultValue

    var max = list[0]
    for (item in list) {
        if (item > max) {
            max = item
        }
    }
    return max
}

fun main() {
    for (n in 1..50) {
        var isPrime = true
        if (n < 2) isPrime = false
        else {
            for (i in 2 until n) {
                if (n % i == 0) {
                    isPrime = false
                    break
                }
            }
        }

        if (isPrime) {
            if (n % 5 == 0) continue
            if (n > 30) break
            println(n)
        }
    }
}

