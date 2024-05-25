package Basics.Oops_Program.Abstraction

// Interface for animal behavior
interface Animal {
    fun run()
    fun eat()

    // Default implementation for sleep behavior (optional for subclasses)
    fun sleep() {
        println("Animal is sleeping")
    }
}

// Interface for special powers (optional)
interface Power {
    fun power()
}

// Class Deer implementing Animal and Power
class Deer : Animal, Power {
    override fun run() {
        println("Deer run with 4 legs")
    }

    override fun eat() {
        println("Deer eats grass")
    }

    // Can override the default sleep behavior if needed
    // override fun sleep() {
    //     println("Deer sleeps peacefully")
    // }

    override fun power() {
        println("Deer doesn't have special ability")
    }
}

// Class Tiger implementing Animal and Power
class Tiger : Animal, Power {
    override fun run() {
        println("Tiger runs faster than Deer with all 4 legs")
    }

    override fun eat() {
        println("Tiger eats deer")
    }

    override fun power() {
        println("Tiger has special ability to kill any animal")
    }
}

// Function to perform animal actions
fun doAnimalStuff(animal: Animal) {
    animal.run()
    animal.eat()
    animal.sleep() // Can call sleep() because it's a default method in Animal
}

// Function to perform power actions (if the object implements Power)
fun doPower(power: Power) {
    power.power()
}

fun main() {
    // Upcasting with doAnimalStuff() and doPower() (if applicable)
    doAnimalStuff(Deer())
    doPower(Deer()) // Deer doesn't implement a special power
    doAnimalStuff(Tiger())
    doPower(Tiger())
}

// Note: Interfaces can have multiple inheritances in Kotlin, while abstract classes cannot.