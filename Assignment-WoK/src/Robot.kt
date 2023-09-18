data class Coffee(val type: String, val sugar: Int)

class Robot(private val name: String){

    private val daysToSkipAlarm = mutableListOf("Saturday", "Sunday")

    private var waterTemp: Int? = null
    private var bathingSchedule = mutableMapOf<String, List<String>>()

    val timetable = mutableMapOf<String, List<String>>()

    fun setDaysToSkipAlarm(days:Array<String>){
        daysToSkipAlarm.addAll(days)
    }

    fun ringAlarm(time: String){
        if (!daysToSkipAlarm.contains(getDayOfWeek())){
            println("$name is ringing the alarm at $time")
        }
    }

    fun setWaterTemp(temp: Int){
        waterTemp = temp
    }

    fun cookMeal(mealType: String){
        val foodOptions = when(mealType){
            "breakfast" -> listOf("Cereal", "Omelette", "Pancakes")
            "lunch" -> listOf("Sandwich", "Salad", "Pasta")
            else -> emptyList()
        }

        if (foodOptions.isNotEmpty()){
            val randomFood = foodOptions.random()
            println("$name is cooking $randomFood for $mealType")
        } else {
            println("$name doesn't know how to cook $mealType")
        }
    }

    fun ironClothes(outfit: String){
        println("$name is ironing $outfit")
    }

    fun makeCoffee(preference: Coffee){
        println("$name is making ${preference.type} coffee with ${preference.sugar} sugar")
    }

    fun packBag(day: String){
        val itemsToPack = timetable[day]
        println("$name is packing the bag with: ${itemsToPack?.joinToString(", ")}")
    }

    private fun getDayOfWeek(): String{
        var day = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        return day.random()
    }
}

fun main(){

    val myRobot = Robot("Robert")

    var offDays = arrayOf("Sunday", "Saturday")
    myRobot.setDaysToSkipAlarm(offDays)

    myRobot.ringAlarm("7:00 AM")

    myRobot.setWaterTemp(38)

    myRobot.cookMeal("breakfast")

    val coffeePref = Coffee("Latte", 2)

    myRobot.makeCoffee(coffeePref)

    myRobot.timetable["Monday"] = listOf("Books", "Laptop")

    myRobot.packBag("Monday")

    myRobot.ironClothes("Work attire")
}