fun array1(){
    var name = "Bitcode"
    println("${name.slice(3..6)}")

    var range2 = 1..20
    var range1 = 10.downTo(1)
    for (i in 10.downTo(1)){
        println("Values are : $i")
    }

    for(num in (-100..10).reversed().step(30)){
        println("Numbers are : $num")
    }

    var range3 = 100..500
    /*for (i in 200..range3.sum()){

    }*/

    var numbers = arrayOf(10,23,31,45,50,478)
    for((index,num) in numbers.withIndex()){
       // println("Index -- $index & Number -- $num")

        /*if(index%2 == 0){
           println("${num+5}")
        } else {
            println("${num-5}")
        }*/

        if(num%2 == 0){
            println("${num*10}")
        } else {
            println("${num*5}")
        }
    }
}

fun minimumOfTwo(){
    var num1 : Int = 10
    var num2 : Int = 23
    var minimum : Int
    minimum = if(num1 < num2){
                num1
    } else {
                num2
    }
    println("Minimum value is $num1")
}

fun misc(){
    var number = 800
    when(number){
        1 -> {
            //number += 10
            number += 10
            println("$number")
        }
        2 -> println("${number * 10}")
        3 -> {
            println("$number")
            number + 40
        }
        in 80..100 -> {
            println("${number + 100 * 5}")
        }
        else -> {
            println("The number is not in the range")
        }
    }
    println("Num is ------$number")
}

fun main(){
    misc()
    //minimumOfTwo()
    //array1()
}