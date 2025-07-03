package org.example.Ontap1_10

/*Yêu cầu:
Viết hàm commonItems(list1: List<String>, list2: List<String>) dùng intersect trả về Set chứa các phần tử chung.
Viết hàm groupItems(items: List<String>) dùng groupBy trả về Map<Char, List>, nhóm theo ký tự đầu.
Trong main, tạo listOf("Apple", "Banana") và listOf("Apple", "Cherry"), gọi cả hai hàm,
    dùng keys và destructuring để in "Common: result." và "Group B: names.".
Đầu ra:
Common: Apple.
Group B: Banana.

Dùng list1.toSet().intersect(list2.toSet()) (Atom 2.11).
Group: items.groupBy { it[0] } (Atom 2.12).
fun commonItems(list1: List<String>, list2: List<String>) = list1.toSet().intersect(list2.toSet())
 */

fun commonItems(list1: List<String>, list2: List<String>): Set<String> {
    return list1.toSet().intersect(list2.toSet())
}

fun groupItems(items: List<String>): Map<Char, List<String>> {
    return items.groupBy { it[0] }
}

fun main() {
    val list1 = listOf("Apple", "Banana")
    val list2 = listOf("Apple", "Cherry")
    println("Common: ${commonItems(list1, list2).joinToString()}.")
    val groups = groupItems(list1)
    for ((key, names) in groups) {
        if (key == 'B') {
            println("Group $key: ${names.joinToString()}.")
        }
    }
}
