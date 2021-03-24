fun main() {
    println(method(327))
}

fun method(ricxvi: Int): Int {
    var jami: Int = 0
    var namravli: Int = 1
    var temp = 0
    var gadmocemuliRicxvi: Int = ricxvi

    while (gadmocemuliRicxvi > 0) {
        temp = gadmocemuliRicxvi % 10
        jami += temp
        namravli *= temp
        gadmocemuliRicxvi /= 10
    }

    return namravli - jami
}