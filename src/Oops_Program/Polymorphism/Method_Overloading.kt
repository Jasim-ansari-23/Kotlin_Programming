package Basics.Oops_Program

fun main() {
    var cal = Calculator()
    println(cal.add(2,4))
    println(cal.add(2.2, 5.5))
    println(cal.add(4,6,8,9))
}

class Calculator{
    fun add(a : Int, b : Int) : Int{
        return a+b
    }

    fun add(c : Double, d : Double) : Double{
        return c*d
    }

    fun add(a : Int, b : Int, c : Int, d : Int) : Int{
        return a+b+c+d
    }
}

// It's called -> Compile time Polymorphism
// -> “poly” means many and “morphs” means forms, So it means many forms. (One person different behaviour )