class Cats (legs: Int, color: String): Animals(legs, color) {

//    fun purr(){
//        println("Purr")
//    }

    override fun sounds() {
        println("Purr")
    }
}