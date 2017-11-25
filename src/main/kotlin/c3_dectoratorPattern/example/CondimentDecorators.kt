package c3_dectoratorPattern.expample

abstract class CondimentDecorator: Beverage() {
    abstract protected var beverage: Beverage
}

class Mocha(override var beverage: Beverage) : CondimentDecorator() {

    override var mDescription = "Mocha"

    override fun getDescription(): String = beverage.getDescription() + " + " +mDescription

    override fun cost(): Double = beverage.cost() + 2.0
}