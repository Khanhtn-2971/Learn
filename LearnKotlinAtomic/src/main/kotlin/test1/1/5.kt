package test1.`1`

fun main() {
    for (i in 1..10) {
        if (i==8){
            break
        }
        else if (i % 2 == 0) {
            println("Số $i là chẵn: true")
        }
        else
            println("Số $i là chẵn: false")
    }
}