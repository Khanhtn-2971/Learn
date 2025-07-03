package org.example.Ontap1_11.bai2

fun String?.isValidEmail(): Boolean {

    return when {
        this == null -> false
        !this.startsWith("STAFF_") -> false
        this.length < 10 -> false
        !Regex(".*_\\d+$").matches(this) -> false
        else -> true
    }
    /*
        val parts = this.split("_")
        if (parts.size < 3) return false  // Phải có ít nhất 3 phần: STAFF, <tên>, <số>
        if (parts[0] != "STAFF") return false
        val name = parts[1]
        val nameLength = name.length
        if (this.length < 10) return false
        val lastPart = parts[2]
        if (!lastPart.all { it.isDigit() }) return false
     */
}


fun List<String?>.uniqueValidEmails(): Set<String> {
    return this.filterNotNull()
        .filter { it.isValidEmail() }
        .toSet()
}

fun Map<Int, List<String>>.printGroupedEmails() {
    this.forEach { (key, values) ->
        println("Độ dài $key:")
        println(values.joinToString("\n") { "- $it" })
    }
}

fun main() {
    val rawEmails = listOf(
        "STAFF_John_123", "staff_Mary_456", null, "INVALID", "STAFF_Anna_789",
        "STAFF_John_123", "", "STAFF_Bob_101", "STAFF_A_1"
    )
    println("✅ Mã hợp lệ:")
    val validEmails = rawEmails.uniqueValidEmails()
    validEmails.groupBy { it.split("_")[1].length }.printGroupedEmails()
    val invalidCodes = rawEmails.filter { it == null || !it.isValidEmail() }
    if (invalidCodes.isEmpty()) {
    } else {
        println("\n❌ Mã bị loại:")
        invalidCodes.forEach { println("- ${it ?: "null"}") }
    }

    println("\n📊 Thống kê:")
    println("- Tổng số email đầu vào: ${rawEmails.size}")
    println("- Email hợp lệ: ${validEmails.size}")
    println("- Email không hợp lệ: ${rawEmails.size - validEmails.size}")
}

/*
/**
 * Kiểm tra email hợp lệ: bắt đầu bằng "STAFF_", độ dài >= 10, kết thúc bằng số.
 */
fun String?.isValidEmail(): Boolean {
    if (this == null || !this.startsWith("STAFF_") || this.length < 10) return false
    val parts = this.split("_")
    if (parts.size < 3) return false // Phải có ít nhất 3 phần: STAFF, tên, số
    return parts.last().toIntOrNull() != null // Phần cuối phải là số
}

/**
 * Lọc danh sách email, bỏ null và trùng lặp, trả về tập hợp email hợp lệ.
 */
fun List<String?>.uniqueValidEmails(): Set<String> {
    return this.filterNotNull()
        .filter { it.isValidEmail() }
        .toSet()
}

/**
 * In email đã nhóm theo độ dài tên, hiển thị số email mỗi nhóm.
 */
fun Map<Int, List<String>>.printGroupedEmails() {
    if (this.isEmpty()) {
        println("Không có email hợp lệ.")
        return
    }
    this.forEach { (length, emails) ->
        println("Độ dài tên $length (Tổng: ${emails.size} email):")
        println(emails.joinToString("\n") { "- $it" })
    }
}

/**
 * Chương trình chính: in email hợp lệ, không hợp lệ, và thống kê.
 */
fun main() {
    val rawEmails = listOf(
        "STAFF_John_123", "staff_Mary_456", null, "INVALID", "STAFF_Anna_789",
        "STAFF_John_123", "", "STAFF_Bob_101", "STAFF_A_1"
    )

    // Lấy email hợp lệ và nhóm theo độ dài tên
    val validEmails = rawEmails.uniqueValidEmails()
    val groupedEmails = validEmails.groupBy { it.split("_")[1].length }

    // In email hợp lệ
    println("✅ Email hợp lệ (Tổng: ${validEmails.size} email):")
    groupedEmails.printGroupedEmails()

    // In email không hợp lệ
    println("\n❌ Email bị loại:")
    val invalidEmails = rawEmails.filter { !it.isValidEmail() }
    if (invalidEmails.isEmpty()) {
        println("Không có email bị loại.")
    } else {
        invalidEmails.forEach { println("- ${it ?: "null"}") }
    }

    // Thống kê
    println("\n📊 Thống kê:")
    println("- Tổng số email đầu vào: ${rawEmails.size}")
    println("- Email hợp lệ: ${validEmails.size}")
    println("- Email không hợp lệ: ${rawEmails.size - validEmails.size}")
}
 */