package org.example.Ontap1_11

/*🔥 Bài 3 – Lọc và sắp xếp danh sách sinh viên
Tạo data class Student(val name: String, val score: Int?).
Viết hàm:
fun List<Student>.sortedValidScores(): List<String>

Bỏ qua sinh viên có điểm null.
Trả về danh sách tên sinh viên có điểm > 50, sắp xếp theo điểm giảm dần.
 */

data class Student(val name: String, val score: Int?)

fun List<Student>.sortedValidScores(): List<String> {
    return this
        .filter { it.score != null && it.score > 50 }
        .sortedByDescending { it.score }
        .map { it.name }
}
