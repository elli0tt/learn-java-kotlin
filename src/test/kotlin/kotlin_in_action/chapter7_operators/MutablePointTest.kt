package kotlin_in_action.chapter7_operators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MutablePointTest {

    @Test
    fun `MutablePoint get`() {
        val point = MutablePoint(15, 20)

        val expectedX = 15
        val expectedY = 20

        val actualX = point[0]
        val actualY = point[1]

        Assertions.assertEquals(expectedX, actualX)
        Assertions.assertEquals(expectedY, actualY)
    }

    @Test
    fun `MutablePoint set`() {
        val point = MutablePoint(15, 15)

        point[0] = 100
        point[1] = 200

        Assertions.assertEquals(100, point.x)
        Assertions.assertEquals(200, point.y)
    }
}