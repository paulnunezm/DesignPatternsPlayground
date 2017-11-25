package c3_dectoratorPattern.exercise

interface Weapon {
    var bulletCapacity: Int
    var currentBullets: Int
    fun shoot()
    fun reload()
}
class EmptyHanded : Weapon{
    override var bulletCapacity = 0
    override var currentBullets = 0

    override fun shoot() {
        println("Karate punch")
    }

    override fun reload() {
        println("Breath")
    }

}

class Pistol: Weapon {
    override var bulletCapacity = 6
    override var currentBullets = 6

    override fun shoot() {
        if (bulletCapacity > 0) {
            currentBullets--;
            println("Bang...")
            println("Bullet count: $currentBullets")
        } else {
            print("reload! reload!")
        }
    }

    override fun reload() {
        println("reloaded")
        currentBullets = bulletCapacity
    }
}
