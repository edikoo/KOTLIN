

fun main() {

    val point = Point(10.5, 20.3)
    val point2 = Point(10.5, 20.3)

    println(point)
    println(point == point2)
    point.method()
    println(point)

}
class Point(val x: Double, var y: Double) {

    override fun toString(): String {
        return "$x; $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Point) return false
        return x == other.x && y == other.y
    }

    fun method() {
        y *= -1
    }

}