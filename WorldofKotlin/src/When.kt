fun main() {
    val num = 0
    when{
        num > 0 -> println("Positive")
        num < 0 -> println("Negative")
        else -> println("Zero")
    }

    val n = 5

    when(n){
        in 1..10 -> println("Between 1 and 10")
        in 11..20 -> println("Between 11 and 20")
        else -> println("None")
    }
}