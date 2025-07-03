package ngay15

data class Student(val name: String, val grade: Int)


fun getHighestScore(List: List<Student>):Pair<String, Int> {
    val topStudent = List.maxByOrNull {it.grade}
    return if(topStudent!=null){
        Pair(topStudent.name, topStudent.grade)
    }
    else{
        Pair("No Student", 0)
    }

}
fun main() {
    val students = listOf(
        Student("Alice", 90),
        Student("Bob", 85),
        Student("Charlie", 90)
    )

    for(i in students) {
        println("Student(name=${i.name}, grade=${i.grade})")
    }

    println("Highest score: ${getHighestScore(students)}")
}