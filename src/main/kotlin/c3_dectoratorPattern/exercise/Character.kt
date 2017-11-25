package c3_dectoratorPattern.exercise

interface Character {
    fun shootWeapon()
    fun reload()
}

class Neo : Character {

    var weapon: Weapon = EmptyHanded()

    override fun reload() {
        weapon.reload()
    }

    override fun shootWeapon() {
        weapon.shoot()
    }
}