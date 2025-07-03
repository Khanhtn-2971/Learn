package org.example.ngay11

/*
Viết extension function List<String?>.uniqueValid() dùng filter, toSet, và safe call trả về Set chứa các chuỗi không null, dài ít nhất 2 ký tự.
Viết extension function String?.isValidCode() trả về true nếu chuỗi không null và bắt đầu bằng "CODE_".
Viết hàm processCodes(codes: List<String?>) dùng when expression, non-null assertion,
        và safe call trả về Set chứa các mã hợp lệ (theo isValidCode) sau khi gọi uniqueValid. Nếu danh sách rỗng, trả về emptySet().
Trong main, tạo listOf("CODE_123", null, "CODE_456", "TEST"), gọi hàm, in "Valid codes: result." (dùng joinToString).
Đầu ra:
Valid codes: CODE_123, CODE_456.
Gợi ý:
Extension: filterNotNull().filter { it.length >= 2 }.toSet() (Atoms 2.9, 2.11).
Kiểm tra: this?.startsWith("CODE_") == true (Atom 3.9).
When: when { codes.isEmpty() -> emptySet(); else -> ... } (Atom 3.4).
fun String?.isValidCode() = this?.startsWith("CODE_") == true
 */

fun List<String?>.uniqueValid(): Set<String> {
    return this.filter { it?.length ?: 0 >= 2 }  // safe call
        .mapNotNull { it }                // loại bỏ null
        .toSet()
}

fun String?.isValidCode(): Boolean {
    return this?.startsWith("CODE_") == true     // safe call
}

fun processCodes(codes: List<String?>): Set<String> {
    return when {
        codes.isEmpty() -> emptySet()
        else -> codes.uniqueValid()
            .filter { it.isValidCode() }  // safe call sẽ được dùng ở isValidCode()
            .map { it!! }                 // dùng non-null assertion !!
            .toSet()
    }
}

fun main() {
    val list = listOf("CODE_123", null, "CODE_456", "TEST")
    println("Valid codes: ${processCodes(list).joinToString()}.")
}
