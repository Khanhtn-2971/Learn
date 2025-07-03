package org.example.Ontap1_11

/*
 Bài 2 – Extension function với List nullable
Viết extension function List<String?>.countValidCodes():
Một code hợp lệ là không null, không rỗng, bắt đầu bằng "CODE_".
Trả về số lượng code hợp lệ.
 */

fun List<String?>.countValidCodes(): Int {
    var tong = 0
    for (i in this) {
        if (i != null && i != "" && i?.startsWith("CODE_") == true) {
            tong++
        }
    }
    return tong
}

fun List<String?>.countValidCodes1(): Int {
    return this.count { it != null && it.isNotEmpty() && it.startsWith("CODE_") }
}

fun List<String?>.countValidCodes2(): Int {
    return this.count { !it.isNullOrEmpty() && it.startsWith("CODE_") }
}
