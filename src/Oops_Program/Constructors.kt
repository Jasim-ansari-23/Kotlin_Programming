package Basics.Oops_Program

fun main() {
    val car = Car("Maruti", "White")
    println("Car's model: ${car.model} and it's color is: ${car.color}")
    car.engine()
    car.stop()
}

class Car{
    var model : String
    var color : String

    constructor(model : String, color : String){
        this.model = model
        this.color = color
        println("Cars object created")
    }

    fun engine(){
        println("$model's engine has started")
    }

    fun stop(){
        println("$model is stopped")
    }
}