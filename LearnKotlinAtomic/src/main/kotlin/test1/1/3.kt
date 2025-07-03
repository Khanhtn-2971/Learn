package test1.`1`

fun main() {
    val listPointStudent = listOf(8.5, 7.0, 8.5, 5.5, 6.8)
    val setPointStudent = listPointStudent.toSet()

    println("Điểm duy nhất: $setPointStudent")

    var i = 0
    while(i <listPointStudent.size){
        println("Điểm học sinh ${i+1}: ${listPointStudent[i]}")
        i++
    }

    val averageScore: Double = listPointStudent.sum()/listPointStudent.size

    val ranking = when {
        averageScore >= 8.0 -> "Giỏi"
        averageScore >= 6.0 -> "Khá"
        averageScore < 6.0 -> "Trung bình"
        else -> "vô lí"

    }

    println("Điểm trung bình: $averageScore - Xếp loại: $ranking")
}