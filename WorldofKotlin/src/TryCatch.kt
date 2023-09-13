fun main() {
    val d = arrayOf(3, 4, 5, 6)

    try {
        println(d[4])
    } catch (e: ArrayIndexOutOfBoundsException){
        println(e.message)
    } finally {
        println(d[2])
    }

    var nullValue: String? = null

    println(nullValue)
    println(nullValue?.length ?: "This is null")

    val nullList = listOf(1, 2, 3, null, 4, 5, null)
    val nullArrayList = arrayListOf("This", null, "is", "a", null, "statement")

    println("The list without the null values is: ${nullList.filterNotNull()}")
    print("The array list without the null values is: ${nullArrayList.filterNotNull()}")
}