package Basics.Array

fun main() {
    sumNums(13,34,55)
}

// (vararg) is used to take multiple values just like array
fun sumNums(vararg nums : Int){
    var sum = 0
    for(value in nums){
        sum += value
    }
    println("Sum is: $sum")

    println(nums::class.simpleName) // To see the reference of this Integer Array
}