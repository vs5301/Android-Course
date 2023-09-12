fun main() {
    val a = 10
    val b = 11

    val maxValue: Int = if (a > b) {
        a
    } else {
        b
    }

    println(maxValue)

    val c = 3

    if (a >= 0 && a <= 5){
        println("The value of integer is between 0-5")
    } else {
        println("The value of integer is not between 0-5")
    }
}