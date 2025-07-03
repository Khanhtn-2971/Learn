package org.example.Ontap1_11

/*
✅ Bài 10 – Kiểm tra mã code hợp lệ (3.1, 3.8, 3.9, 3.10)
Viết extension function String?.isValidCode() trả về true nếu chuỗi bắt đầu bằng "CODE_".
Viết hàm filterValidCodes(codes: List<String?>): Set<String> lọc các mã hợp lệ, bỏ qua null.
 */

fun String?.isValidCode1(): Boolean{
    return this?.startsWith("CODE_") == true
}

fun filterValidCodes(codes: List<String?>): Set<String>{
    return codes.filterNotNull().filter { it.isValidCode1() }.toSet()
}