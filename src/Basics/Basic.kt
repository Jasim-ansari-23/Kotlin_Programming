package Basics

fun main() {
    // Infer data types
    val name = "Jasim"
    val age = 21
    val num = 729
    var devices = 2 // Mutable Data types
    println("$name, $age, $num")

    // Explicitly Converted data types
    val name2 : String = "Jibrail" // Explicitly Converted into Strings
    val ch : Char = 'J' // Explicitly Converted into Character
    val inte : Int = 234 // Explicitly Converted into Integer
    val sh : Short = 2 // Explicitly converted into short integer
    val covrt = 23

    covrt.toFloat() // Converted into float
    println(covrt)
}