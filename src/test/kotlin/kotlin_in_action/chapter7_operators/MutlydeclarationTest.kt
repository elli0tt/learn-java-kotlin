package kotlin_in_action.chapter7_operators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MutlydeclarationTest {

    @Test
    fun test() {
        val (x, y) = Point(10, 15)

        Assertions.assertEquals(10, x)
        Assertions.assertEquals(15, y)
    }
}