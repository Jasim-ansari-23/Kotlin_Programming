package Basics.Functions

fun main() {
    cube(40){
        println(it) //You can show the callback lambda function via (it) keyword
    }
}

fun cube(num : Int, callback : (message : String) -> Unit){
    println("Cube is: ${num*num*num}")
    callback("Completed") // Higher order function called, means another function
}