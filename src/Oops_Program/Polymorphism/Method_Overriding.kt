package Basics.Oops_Program.Polymorphism

fun main() {
    var circle = Circle()
    circle.shape()
}

open class Shape{
    open fun shape(){
        println("Generic shape drawing")
    }
}

class Circle : Shape() {
    override fun shape(){
        println("It's drawing the Circle")
    }
}

// It's called (Run time polymorphism), where its decide which one method should I call while run time