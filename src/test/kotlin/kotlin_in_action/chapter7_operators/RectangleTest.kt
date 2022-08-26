package kotlin_in_action.chapter7_operators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RectangleTest {

    @Test
    fun `Point in Rectangle`() {
        val rectangle = Rectangle(upperLeft = Point(10, 10), lowerRight = Point(100, 100))
        val point = Point(50, 50)

        Assertions.assertTrue(point in rectangle)
    }

    @Test
    fun `Point out of Rectangle`() {
        val rectangle = Rectangle(upperLeft = Point(10, 10), lowerRight = Point(100, 100))
        val point = Point(150, 50)

        Assertions.assertFalse(point in rectangle)
    }
}