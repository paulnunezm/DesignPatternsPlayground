package c1_stategyPattern

interface QuackBehavior{
    fun quack()
}

interface FlyBehavior {
    fun fly()
}

/**
 * Note: This way we can encapsulate algorithms.
 */

class Quack: QuackBehavior{
    override fun quack() {
        println("quack")
    }
}

class FakeQuack: QuackBehavior{
    override fun quack() {
        println("quick, quick!")
    }
}

class NormalFly: FlyBehavior{
    override fun fly() {
        println("normal fly")
    }
}

class NoFly: FlyBehavior{
    override fun fly() {
        println("don't let me go I can't fly!")
    }
}