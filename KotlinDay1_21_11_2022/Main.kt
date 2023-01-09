fun addition(numberOne : Int, numberTwo : Int) : Int{
    return numberOne + numberTwo
}

fun addition1(n1 : Int, n2 : Int){
    n1 + n2
}

//single line function
fun add(n1 : Int, n2 : Int) = n1+n2

//private void fName(){

//}
fun display(){
    var add = add(23,34)
    println("Add : $add")
    var resAddition = addition1(12,23)
    println("Result of addition is : $resAddition")
    var number : Int = 20
    number = 10
    println("The number value is : $number")
    number + 10
    println("The number is : $number")

    var studentName : String = "Krishna"
    println("The studentName is : $studentName")

    //type inference
    var name = "Suraj"
    println("Name is : $name")

    var salary = 34052.34F
    var salaryOfEmployee = 23453.34
    println("Salary -- $salary" + "Salary of Employee -- $salaryOfEmployee")
}

fun array1(){
    var programmingLanguages = arrayOf("C", "Cpp", "Java", "Swift", "Kotlin")

    for (eachLanguage in programmingLanguages){
        println("$eachLanguage")
    }
        var rollNumbers = intArrayOf(1,2,3,4,5,6,7)

    for (eachRollNumber in rollNumbers){
        println("Each Roll number is : $eachRollNumber")
    }


    /*var numbers = arrayOf(23,45,34,56,23,90)
    numbers.indices
    for(index in numbers.indices){
        if(index%2 == 0){

        }
    }*/
}

fun array2(){
    var subjectMarks = Array<Int>(5){
        i -> i + 5
    }

    var marks = Array<Int>(6,{index -> index * 10})

    for (i in 0..marks.size-1){
        println("The value of i is : $i")
        println("${marks[i]} -- ${marks.get(i)}")
    }
}

fun ranges(){
    var numbers = 0..20
    for(number in numbers.step(4)){
        println("Each number is : $number")
    }
}

fun main(){
    ranges()
    array2()
    array1()
    var result = addition(10,23)
    println("The result of addition is : $result")
    display()
}