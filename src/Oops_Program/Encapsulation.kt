package Basics.Oops_Program

fun main() {
    val emp = Employee("Jasim", "Software enjineer", 12)
//    println("Employee 1 name is: ${emp.name}")
//    println("Employee 1's job is: ${emp.job}")
//    println("Employee 1's id is: ${emp.id}")
//    emp.eating()
//    emp.doJob()
//    emp.fId()

//  Let's set the values
//    emp.setName("Jasim")
//    emp.setJob("App development")
//    emp.setID(1)

//  Let's get the values
    println("Employee 1 name is: ${emp.getName()}")
    println("Employee 1's job is: ${emp.getJob()}")
    println("Employee 1's id is: ${emp.getId()}")
}

open class Employee(private var name : String, private var job : String, private var id : Int){ // Primary Constructor
//    constructor(name : String, job : String, id : Int){
//        this.name = name
//        this.job = job
//        this.id = id
//    }

    // <--- Let use getters and setters --->
    // Getters --> We returns value in Getters, and it is used to print the value
    fun getName() : String{
        return name
    }

    // Setters --> We used to refer to the current object & set the value
    fun setName(s: String) {
        this.name = name
    }

    fun getJob() : String{
        return job
    }

    fun setJob(s: String) {
        this.job = job
    }

    fun getId() : Int{
        return id
    }

    fun setID(i: Int) {
        this.id = id
    }

//    Some behaviours, it'll only work when your datatypes are not private
//    fun eating(){
//        println("$name is currently eating")
//    }
//
//    fun doJob(){
//        println("$name is doing his $job job")
//    }
//
//    fun fId(){
//        println("$name is forgotten his id which is $id")
//    }
}