class CallMe: MyInterface, NewInterface {

    override fun hello() {
        println("Function hello")
    }

    override fun greeting() {
        print("New greeting")
    }

    override fun newMethod() {
        println("Function of New interface")
    }
}