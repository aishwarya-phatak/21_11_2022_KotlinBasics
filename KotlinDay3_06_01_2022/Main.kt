class MathematicalOperations {
    private var numberOne: Int = 0
    private var numberTwo: Int = 0

    constructor() {
        numberOne = 0
        numberTwo = 0
    }

    constructor(number1: Int, number2: Int) {
        this.numberOne = number1
        this.numberTwo = number2
    }

    fun display() {
        println(
            "numberOne is : $numberOne" +
                    "  numberTwo is : $numberTwo"
        )
    }

    fun addition() : Int{
        return numberOne + numberTwo
    }

    override fun equals(other: Any?): Boolean {

        var m = other as MathematicalOperations
        if(this.numberOne != m.numberOne){
                return false
        }
        return this.numberTwo == m.numberTwo
    }
}

fun main(){
    var m1 = MathematicalOperations()
    m1.display()
    var m = MathematicalOperations(10,20)
    m.display()
    var result : Int = m.addition()
    println("Result : $result")

    m1.equals(m);

}