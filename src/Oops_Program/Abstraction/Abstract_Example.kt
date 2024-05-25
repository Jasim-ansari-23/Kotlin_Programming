// Abstract class for birds
abstract class Bird {
    abstract fun fly() // Abstract method for flying behavior
    abstract fun eat() // Abstract method for eating behavior

    // Concrete method for sleeping behavior (can be used by subclasses)
    fun sleep() {
        println("Bird is sleeping")
    }
}

// Concrete class Sparrow inheriting from Bird
class Sparrow : Bird() {
    override fun fly() {
        println("Sparrow flying")
    }

    override fun eat() {
        println("Sparrow eating")
    }
}

// Concrete class Crow inheriting from Bird
class Crow : Bird() {
    override fun fly() {
        println("Crow is flying")
    }

    override fun eat() {
        println("Crow is eating")
    }
}

// Function to perform bird actions
fun doBirdStuff(bird: Bird) {
    bird.eat()
    bird.fly()
    bird.sleep() // Can call sleep() because it's a concrete method in Bird
}

fun main() {
    // Upcasting with doBirdStuff()
    doBirdStuff(Crow())
    doBirdStuff(Sparrow())
}

// Let's create an example --->

//abstract class Company_Employee{
//    abstract fun work()
//    abstract fun skills()
//
//    fun projects(){
//        println("Every employee managing its projects")
//    }
//}
//
//class Developer : Company_Employee(){
//    override fun work() {
//        println("Developer is managing its development works")
//    }
//
//    override fun skills() {
//        println("Developers has Web and Mobile Apps Skills")
//    }
//}
//
//class Hr : Company_Employee(){
//    override fun work() {
//        println("HR is managing its Hr department work")
//    }
//
//    override fun skills() {
//        println("HR doesn't have any required skills except business")
//    }
//
//}
//
//fun doCompanyWork(companyEmployee: Company_Employee){
//    companyEmployee.work()
//    companyEmployee.skills()
//    companyEmployee.projects()
//}
//
//fun main() {
//    var emp1 = Developer()
//    emp1.work()
//    emp1.skills()
//    emp1.projects()
//
//    doCompanyWork(Hr())
//}

// Note: Interfaces can have multiple inheritances in Kotlin, while abstract classes cannot.
// However, Kotlin still uses abstract classes for scenarios where you need some concrete
// implementation in the base class (like the sleep() method here).