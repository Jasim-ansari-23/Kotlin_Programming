package Basics.Basics

fun main() {
    val result = countDigit(2345)
    println(result)
}

fun countDigit(num : Int) : Int{
    var count = 0
    var number = num

    while(number > 0){
        val result = num % 10
        count++
        number /= 10
    }
    return count
}