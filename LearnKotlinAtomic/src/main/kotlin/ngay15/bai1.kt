package ngay15

fun main() {
    val name: String = "Alice"
    var age: Int = 15

    println("Học sinh: $name, Tuổi: $age")
    age = 16
    println("Học sinh: $name, Tuổi mới: $age")
    age = -6
    if(age >=0)
        println("Học sinh: $name, Tuổi mới: $age")
    else
        println("Tuổi không hợp lệ")
}