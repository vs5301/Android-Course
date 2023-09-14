fun main() {
    val res1 = Restaurants("LcD", 4.1, 200)
    val res2 = Restaurants("Pominoes", 3.9, 150)
    val res3 = Restaurants("Sugar King", 4.0, 250)
    val res4 = Restaurants("Maco Bell", 4.3, 400)
    val res5 = Restaurants("Hubway", 3.5, 200)

    println(res1)
    println(res2)
    println(res3)
    println(res4)
    println(res5)

    val dog1 = Dogs(4, "Brown")
    dog1.eat()
    dog1.sleep()
//  dog1.bark()
    dog1.sounds()

    val cat1 = Cats(4, "White")
    cat1.eat()
    cat1.sleep()
//  cat1.purr()
    cat1.sounds()

    val c = sum(10, 20)

//    val d = difference(20, 10)

    val e = division(20, 10)

    val pro = Product()
//    pro.product(10, 5)

    val a = CallMe()

    a.hello()
    a.greeting()
    a.newMethod()
}

class Product{
    protected fun product(a: Int, b: Int) = a * b
}