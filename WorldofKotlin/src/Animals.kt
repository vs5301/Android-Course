open class Animals (var legs: Int, var color: String) {

    fun eat(){
        println("Eat")
    }

    fun sleep(){
        println("Sleep")
    }

    open fun sounds() {
        println("Sounds")
    }
}