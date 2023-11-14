import java.util.Scanner

class Car(){
    private val scanner = Scanner(System.`in`)

    fun start(){
        println("Hello there :). Kindly input your name:")
        val name: String = scanner.nextLine()

        println("Welcome to CarHires $name")

        println("Choose the category you want")

       val carList = "1: SUV\n2: Sport\n3: Sedan \n4: Muscle "
        println(carList)
    }

    fun carChoices(){
        val carBrandText = "Enter the car brand you want to hire: "
        start()
        println("Enter your choice: ")

        when(scanner.nextInt()) {
            1 -> println(carBrandText)
            2 -> println(carBrandText)
            3 -> println(carBrandText)
            4 -> println(carBrandText)
        }
        val carBrand: String = scanner.next()

        val carBrandOptions: ArrayList<String> = ArrayList()
        carBrandOptions.add("Toyota")
        carBrandOptions.add("Mercedes")
        carBrandOptions.add("Mazda")
        carBrandOptions.add("Honda")
        carBrandOptions.add("Audi")


        for (value in carBrandOptions){
            if (carBrand == value){
                println("The Brand is available")
                println("Enter the car type you wish to hire: ")
                val carType: String = scanner.next()
                println(carType)
                break
            }
        }


    }
}

fun main() {
    val car = Car()
    car.carChoices()
}