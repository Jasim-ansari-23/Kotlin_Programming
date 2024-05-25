package Basics.Array

fun binarySearch(arr : Array<Int>, key : Int) : Int{
    var start = 0
    var end = arr.size-1

    while (start <= end){
        val mid : Int = start + (end-start)/2

        if (arr[mid] == key){
            return mid
        }
        else if (arr[mid] < key){
            start = mid+1
        }
        else{
            end = mid-1
        }
    }
    return -1
}

fun main() {
    val arr : Array<Int> = arrayOf(4,8,10,14,18,20)
    val key = 18
    val index : Int = binarySearch(arr,key)

    if (index == -1){
        println("$key doesn't exist")
    }
    else{
        println("$key found at index: $index")
    }
}