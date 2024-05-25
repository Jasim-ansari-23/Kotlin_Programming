package Basics.Array

fun linearSearch(arr : Array<Int>, key : Int) : Int {
    for(i in arr.indices){
        if (arr[i] == key){
            return i;
        }
    }
    return -1
}

fun main() {
    val arr : Array<Int> = arrayOf(1,2,3,4,5,6,7)
    val key = 6
    val index = linearSearch(arr, key)
    if(index == -1){
        println("Not found")
    }else{
        println("Key found aṭ index: $index")
    }
}
