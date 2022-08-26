package kotlin_in_action.chapter7_operators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ListOperatorsTest {

    @Test
    fun `List plus List`() {
        val list1 = listOf(1, 2)
        val list2 = listOf(3, 4)

        val expected = listOf(1, 2, 3, 4)
        val actual = list1 + list2

        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun `List plus value`() {
        val list = listOf(1, 2)

        val expected = listOf(1, 2, 4)
        val actual = list + 4

        Assertions.assertEquals(expected, actual)
        Assertions.assertFalse(actual === list)
    }

    @Test
    fun `List plus assign value`() {
        val list = arrayListOf(1, 2)
        val temp = list

        val expected = listOf(1, 2, 4)
        list += 4

        Assertions.assertEquals(expected, list)
        Assertions.assertTrue(temp === list)
    }
}