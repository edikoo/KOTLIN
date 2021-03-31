

fun main() {

    var rav4: CarFactory? = CarFactory()
    rav4?.name = "Toyota Rav 4"
    rav4?.color = "Red"
    rav4?.maxSpeed = 180
    rav4?.withTurbo = false
    rav4?.year = 2018


    var rav4_1 = rav4
    rav4_1?.color = "Black"

    print(rav4_1?.color)

    rav4 = null

    print(rav4_1?.name)






}


class CarFactory {

    var num: Float = 0.0F


    override fun hashCode(): Int {
        return super.hashCode()
    }
}