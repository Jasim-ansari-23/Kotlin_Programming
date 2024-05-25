package Basics

// Normal --> Conditional statements

fun main() {
    print("Enter the number: ")
    val num : Int = readln().toInt();
    if(num%2 == 0){
        println("Even number")
    }else{
        println("Odd number")
    }

    main2()
    main3()
    main4()
}

// Use of (in) --> it is used for range expressions and to check if a value belongs to a range

fun main2() {
    println("Enter the marks")
    val marks = readln().toInt()

    if(marks in 80..100){
        println("Grade A")
    }else if(marks in 60..79){
        println("Grade B")
    }else if(marks in 40..59){
        println("Grade C")
    }else{
        println("Failed")
    }
}

// Another one example -->

fun main3() {
    print("Enter your marks: ")
    val marks = readln().toInt()

    val grade : Char = if(marks in 80..100){
        'A'
    }else if(marks in 60..79){
        'B'
    }else if(marks in 40..59){
        'C'
    }else{
        'F'
    }

    println("Your grade is: $grade")
}

// Use of when --> It is a replacement of Switch case statement

fun main4() {
    print("Enter the number: ")
    val marks = readln().toInt()
    val grade : Char = when (marks){
        in 80..100 -> 'A'
        in 60..79 -> 'B'
        in 40..59 -> 'C'
        else -> 'F'
    }
    println("Your grade is: $grade")
}