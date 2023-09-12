fun main() {
    val stringArray = arrayOf("Hello","Kotlin","Programmers")

    println(stringArray[1])

    stringArray[1] = "New String"
    println(stringArray[1])

    println(stringArray.size)

    stringArray[3] = "Increasing Size"
    println(stringArray[3])

    println(stringArray.contentToString())
}