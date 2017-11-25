package c3_dectoratorPattern.exercise

interface WeaponDecorator: Weapon

class MagazineExtender(val weapon: Weapon): WeaponDecorator {
    override var bulletCapacity: Int  = weapon.bulletCapacity *10
    override var currentBullets: Int = bulletCapacity

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
        weapon.currentBullets = bulletCapacity
    }
}