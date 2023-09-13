class Dog(var breed: String, var color: String, var age: Int) {

    fun eat(){
        println("${breed}s eat food")
    }

    fun bark(){
        println("${breed}s bark")
    }
}

fun main(){
    val dog1 = Dog("German Shepherd", "Black", 1)

    dog1.eat()
    dog1.bark()
}