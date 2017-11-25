package c3_dectoratorPattern.expample

abstract class Beverage {
    abstract protected var mDescription: String

    abstract fun getDescription(): String
    abstract fun cost():Double
}


class Espresso : Beverage() {
    override var mDescription = "Espresso"

    override fun getDescription() = mDescription

    override fun cost():Double = 20.0
}

class Decaf() : Beverage() {
    override var mDescription = "Decaf"

    override fun getDescription(): String = mDescription

    override fun cost(): Double = 10.0
}