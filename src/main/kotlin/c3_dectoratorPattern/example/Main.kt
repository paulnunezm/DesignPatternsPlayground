package c3_dectoratorPattern.expample

fun main(args: Array<String>) {
    println("*******************************")

    var beverage_1: Beverage = Espresso()
    beverage_1 = Mocha(beverage_1)
    beverage_1 = Mocha(beverage_1)

    with(beverage_1) {
        println("First beverage: ${getDescription()} and cost: ${cost()}")
    }

    println("*******************************")

    var beverage_2: Beverage = Decaf()
    beverage_2 = Mocha(beverage_2)

    with(beverage_2) {
        println("Second beverage: ${getDescription()} and cost: ${cost()}")
    }
    println("*******************************")

    var beverage_3: Beverage = Espresso()
    beverage_3 = Mocha(beverage_3)

    with(beverage_3) {
        println("Third beverage: ${getDescription()} and cost: ${cost()}")
    }

    println("*******************************")

}