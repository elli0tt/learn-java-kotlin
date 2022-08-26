package kotlin_in_action.chapter7_operators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PointTest {

    @Test
    fun `Point plus Point`() {
        val point1 = Point(10, 15)
        val point2 = Point(15, 20)

        val expected = Point(25, 35)
        val actual = point1 + point2
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun `Point minus Point`() {
        val point1 = Point(15, 15)
        val point2 = Point(10, 10)

        val expected = Point(5, 5)
        val actual = point1 - point2
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun `Point times Int`() {
        val point = Point(10, 10)

        val expected = Point(50, 50)
        val actual = point * 5

        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun `Point plus assign Point`() {
        var point1 = Point(15, 15)
        val point2 = Point(10, 10)

        val expected = Point(25, 25)
        point1 += point2
        Assertions.assertEquals(expected, point1)
    }

    @Test
    fun `Point unary minus`() {
        val point = Point(15, 15)

        val expected = Point(-15, -15)
        val actual = -point

        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun `Point ++`() {
        var point = Point(15, 15)

        val expected = Point(16, 16)
        point++

        Assertions.assertEquals(expected, point)
    }

    @Test
    fun `++ Point`() {
        var point = Point(15, 15)

        val expected = Point(16, 16)
        ++point

        Assertions.assertEquals(expected, point)
    }
}