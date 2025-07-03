fun String?.isValidCode(): Boolean {
    return this?.startsWith("CODE_") == true && this.length >= 8
}

fun List<String?>.uniqueValidCodes(): Set<String> {
    return this.filterNotNull()
        .filter { it.isValidCode() }
        .toSet()
}

fun Map<Int, List<String>>.printGroupedCodes() {
    this.forEach { (key, values) ->
        println("Độ dài $key:")
        println(values.joinToString("\n") { "- $it" })
    }
}

fun main() {
    val rawCodes = listOf(
        "CODE_1234", "code_5678", null, "INVALID", "CODE_XYZ", "CODE_1234", "", "CODE_ABC987"
    )
    // Lấy mã hợp lệ
    val validCodes = rawCodes.uniqueValidCodes()
    // Nhóm mã hợp lệ theo độ dài
    val groupedCodes = validCodes.groupBy { it.length }
    // In mã hợp lệ
    println("✅ Mã hợp lệ:")
    if (groupedCodes.isEmpty()) {
        println("Không có mã hợp lệ.")
    } else {
        groupedCodes.printGroupedCodes()
    }
    // In mã không hợp lệ
    println("\n❌ Mã bị loại:")
    val invalidCodes = rawCodes.filter { it == null || !it.isValidCode() }
    if (invalidCodes.isEmpty()) {
        println("Không có mã bị loại.")
    } else {
        invalidCodes.forEach { println("- ${it ?: "null"}") }
    }
}