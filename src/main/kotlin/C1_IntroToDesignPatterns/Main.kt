package C1_IntroToDesignPatterns

fun main(arg: Array<String>) {

    val plastic = PlasticDuck()
    val duckie = MallardDuck()

    println("**********************")
    println("** Plastic Duck **")
    plastic.performFly()
    plastic.performQuack()
    println("**********************")

    println("**********************")
    println("** Mallard Duck **")
    duckie.performFly()
    duckie.performQuack()
    println("**********************")

    println("**********************")
    println("** Plastic flyable Duck **")
    val plasticFlyableDuck = PlasticDuck()
    plasticFlyableDuck._setFlyBehavior(NormalFly())
    plasticFlyableDuck.performFly()
    plasticFlyableDuck.performQuack()
    println("**********************")



}