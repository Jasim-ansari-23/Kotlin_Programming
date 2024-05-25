package Basics.Functions

fun main() {
    // Lambda function
    val lamd = {
        println("Hello this is lambda function")
    }
    lamd() // Call a lambda function

    val addition = {
        x : Int, y : Int -> println("Addition of a and b is: " + (x+y))
    }
    addition(5,10)
}

// What is lambda -> It is simply known as a lambda or an anonymous function