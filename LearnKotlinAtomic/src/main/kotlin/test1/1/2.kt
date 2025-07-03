package test1.`1`

fun calculateArea(radius: Double):Double{
    return if (radius >= 0) Math.PI * radius * radius
    else throw IllegalArgumentException("Bán kính phải không âm")
}

fun main(){
    try{
        val area = calculateArea(radius= 5.0)
        println("Diện tích hình tròn: %.2f".format(area))
    }
    catch (e:IllegalArgumentException){
        println("Lỗi: ${e.message}")
    }
}