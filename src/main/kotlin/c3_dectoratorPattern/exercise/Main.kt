package c3_dectoratorPattern.exercise

fun main(arg: Array<String>){
    val neo = Neo()
    var gun:Weapon = Pistol()

    neo.weapon = gun
    neo.shootWeapon()
    neo.shootWeapon()
    neo.reload()
    neo.shootWeapon()

    gun = MagazineExtender(gun)
    println()
    println("Set extended magazine")
    neo.weapon = gun
    neo.shootWeapon()
    neo.reload()
    neo.shootWeapon()
}