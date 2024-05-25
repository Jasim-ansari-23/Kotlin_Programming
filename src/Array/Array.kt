package Basics.Array

fun main() {
    // Let's declare the array
    val arr = arrayOf(72,92,99,65,22) //Normal array
    println(arr[4])
    arr[4] = 21 // Changed its value
    println(arr[4])

    val arr2 : Array<String> = arrayOf("Jasim", "Jibrail") // Explicitly declared into String array

    // Print whole array using for loop
    for(i in arr2.indices){
        print(arr2[i]+", ")
    }
    println()

    // Print array in reverse order
    for(j in arr2.indices.reversed()){
        print(arr2[j]+", ")
    }
}