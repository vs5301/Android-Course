fun main() {
    for (i in 1..10){
        print(i)
    }
    println()

    var i = 1
    while (i <= 10){
        print(i)
        i++
    }
    println()

    i = 1
    do {
        print(i)
        i++
    } while (i <= 10)

    val a = arrayOf("a","b","c","d","e","f")

    for (element in a){
        print(element)
    }

    for (i in 10 downTo 1){
        print(i)
    }
}