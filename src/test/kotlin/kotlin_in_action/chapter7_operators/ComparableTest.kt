package kotlin_in_action.chapter7_operators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ComparableTest {

    @Test
    fun `Person greater Person`() {
        val person1 = Person("Ilya", "Pestrikov")
        val person2 = Person("Ilya", "K")

        Assertions.assertTrue(person1 > person2)
        Assertions.assertTrue(person1 >= person2)
    }

    @Test
    fun `Person lesser Person`() {
        val person1 = Person("Ilya", "Pestrikov")
        val person2 = Person("Ilya", "Zasfddsafdsfsdf")

        Assertions.assertTrue(person1 < person2)
        Assertions.assertTrue(person1 <= person2)
    }

    @Test
    fun `Person equals Person`() {
        val person1 = Person("Ilya", "Pestrikov")
        val person2 = Person("Ilya", "Pestrikov")

        Assertions.assertTrue(person1 >= person2)
        Assertions.assertTrue(person2 <= person1)
        Assertions.assertFalse(person1 > person2)
        Assertions.assertFalse(person1 < person2)
    }
}