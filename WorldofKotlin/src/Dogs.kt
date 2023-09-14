class Dogs(legs: Int, color: String): Animals(legs, color) {

//    fun bark(){
//        println("Bark")
//    }

    override fun sounds() {
        println("Bark")
    }
}