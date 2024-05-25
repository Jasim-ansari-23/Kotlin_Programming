package Basics.Oops_Program

// Base class
open class Animal {
    protected var legs : Int = 0
    protected var power : String = ""
    protected var species : String = ""

    constructor(legs: Int, power: String, species: String){
        this.legs = legs
        this.power = power
        this.species = species
    }

    open fun makeSound(){
        println("Generic sound")
    }

    open fun display(){
        println("$species has total $legs legs and it's power is: $power")
        makeSound()
    }
}

// Single inheritance
class Dog(legs: Int, power: String, species : String) : Animal(legs, power, species) {
    override fun makeSound() {
        println("Dog makes sound Woof!")
    }

    override fun display() {
        super.display()
    }
}

// Multilevel Inheritance
open class Tiger(legs: Int, power: String, species: String) : Animal(legs, power, species){
    override fun makeSound() {
        println("Tiger makes sound Growl!")
    }

    override fun display() {
        println("$species has total $legs legs and it's power is: $power and it can kill any species, bheri dangerous")
        makeSound()
    }
}

class Cat(legs: Int, power: String, species: String) : Tiger(legs, power, species){
    override fun makeSound() {
        println("Cat makes sound Meow!")
    }

    override fun display() {
        println("$species has total $legs legs and it's power is: $power and she is a tiger's mausi")
        makeSound()
    }
}

// Hierarchical Inheritance
class Dear(legs: Int, power: String, species: String) : Animal(legs, power, species){
    override fun makeSound() {
        println("Dear makes sound Grunting!")
    }

    override fun display() {
        println("$species has total $legs legs and it's power is: $power")
        makeSound()
    }
}

class Goat(legs: Int, power: String, species: String) : Animal(legs, power, species){
    override fun makeSound() {
        println("Goat makes sound Meeaee!")
    }

    override fun display() {
        println("$species has total $legs legs and it's power is: $power")
        makeSound()
    }
}

// Multiple Inheritance using interfaces
interface canFly{
    fun fly(){
        println("Duck can fly")
    }
}

interface canSwim{

    fun swim(){
        println("Duck can swim")
    }
}

class Duck : canFly, canSwim

// Hybrid Inheritance
class Hen(legs: Int, power: String, species: String) : Animal(legs, power, species), canFly, canSwim{
    override fun fly() {
        println("$species can fly little bit")
    }

    override fun swim() {
        println("$species can swim little bit, but bhery tasty")
    }

    override fun makeSound() {
        println("$species makes sound Kukrukoo!")
    }

    override fun display() {
        println("$species has total $legs legs and it's power is: $power")
        makeSound()
        fly()
        swim()
    }
}

fun main() {
    // Single inheritance
    var dog = Dog(4, "Biting", "Dog")
    dog.display()

    // Multilevel Inheritance
    var tiger = Tiger(4, "Animal-Eater", "Tiger")
    tiger.display()

    var cat = Cat(4, "Biting", "Cat")
    cat.display()

    // Hierarchical Inheritance
    var dear = Dear(4, "Jumping Jpaang", "Dear")
    dear.display()

    var goat = Goat(4, "Nothing", "Goat")
    goat.display()

    // Multiple Inheritance using interfaces
    var duck = Duck()
    duck.fly()
    duck.swim()

    // Hybrid Inheritance
    var hen = Hen(2, "Bhery tasty", "Hen")
    hen.display()
}