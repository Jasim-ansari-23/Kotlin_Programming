package Basics

fun main() {
    println("Enter your name")
    val name = readLine() // Use to take an input from user
    println("Enter your age")
    val age = readln().toInt() // Take a particular input such as integer
    println("Enter your mobile num")
    val num : Long = readln().toLong() // Also, it can be for long integer
    println(name)
    println(age)
    println(num)
}

// Note --> readln() and readLine(), both are usable for taking an input