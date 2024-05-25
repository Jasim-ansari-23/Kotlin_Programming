package Basics.Oops_Program

fun main() {
    val s1 = Student("Jasim", 21, 9.6F)
    println("Name is: ${s1.name}, age: ${s1.age}, and CGPA: ${s1.cgpa}")
    s1.behaviour()
//    s1.name = "Jasim"
//    s1.age = 22
//    s1.cgpa = 8.6F
//    s1.behaviour()
}

//class Student{
//    var name : String = ""
//    var age : Int = 0
//    var cgpa : Float = 0.0F
//
//    // Let's see the example by creating a constructor
//    constructor(name : String, age : Int, cgpa : Float){
//        this.name = name
//        this.age = age
//        this.cgpa = cgpa
//    }
//
//    fun behaviour(){
//        println("I don't know what I'm doing")
//    }
//}

// Let's see the another example of alternative constructor -->
class Student(var name: String, var age: Int, var cgpa: Float) {

    init {
        println("Creating object")
    }

    fun behaviour() {
        println("I don't know what I'm doing")
    }
}