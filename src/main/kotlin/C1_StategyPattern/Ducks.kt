package C1_StategyPattern

abstract class Duck {
    protected lateinit var quackBehavior: QuackBehavior
    protected lateinit var flyBehavior: FlyBehavior

    fun swim() {
        println("swim")
    }

    fun display() {
        println("display")
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    fun _setQuackBehavior(quackBehavior: QuackBehavior){
        this.quackBehavior = quackBehavior
    }

    fun _setFlyBehavior(flyBehavior: FlyBehavior){
        this.flyBehavior = flyBehavior
    }
}

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = NormalFly()
    }
}

class PlasticDuck : Duck() {
    init {
        quackBehavior = FakeQuack()
        flyBehavior = NoFly()
    }
}
