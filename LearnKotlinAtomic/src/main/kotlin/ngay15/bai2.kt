    package ngay15

    fun isPrime(n: Int): String {
        var dem = 0
        for (i in 1..n) {
            if (n % i == 0 && n != 1) {
                dem++
            }
            if (dem > 2){
                return "Number $n is Prime"
            }
        }
            return if(dem==2)
                "Number $n Not Prime"
            else "Number $n Not Prime"
    }

    fun main() {
        println(isPrime(2))
        println(isPrime(4))
        println(isPrime(7))
    }