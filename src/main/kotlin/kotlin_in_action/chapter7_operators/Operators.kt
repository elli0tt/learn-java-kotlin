package kotlin_in_action.chapter7_operators

import java.beans.PropertyChangeSupport

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}

operator fun Point.times(scale: Int): Point {
    return Point(x * scale, y * scale)
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun Point.inc(): Point {
    return Point(x + 1, y + 1)
}

data class Person(val firstName: String, val lastName: String) : Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::lastName)
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Unknown index")
    }
}

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> {
            x = value
        }
        1 -> {
            y = value
        }
        else -> throw IndexOutOfBoundsException("Unknown index")
    }
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(point: Point): Boolean {
    return point.x in upperLeft.x..lowerRight.x && point.x in upperLeft.y..lowerRight.y
}

class MultydeclarationPoint(val x: Int, val y: Int)

operator fun Point.component1() = x

operator fun Point.component2() = y