package kotlin_in_action.chapter7_operators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DelegateTest {

    @Test
    fun `observable Delegate`() {
        val person = PersonWithDelegate("dsf", 10, 0)
        person.observableProperty = 15
    }

    @Test
    fun `vetoable Delegate`() {
        val initialSalary = 1000
        val person = PersonWithDelegate("fsdf", 10, initialSalary)
        person.vetoableProperty = 5
        Assertions.assertEquals(initialSalary, person.vetoableProperty)
    }

    @Test
    fun `notnull Delegate throws on get() before initialization`() {
        val person = PersonWithDelegate("sf", 10, 1)

        Assertions.assertThrows(IllegalStateException::class.java) {
            person.notNullProperty
        }
    }

    @Test
    fun `notnull Delegate doesn't throw on get() after initialization`() {
        val person = PersonWithDelegate("afds", 10, 15)
        person.notNullProperty = 10

        Assertions.assertDoesNotThrow {
            person.notNullProperty
        }
    }

    @Test
    fun `LoggerDelegate`() {
        val person = PersonWithLoggerDelegate("adfsf")

        val expectedName = "fdasfd"
        person.name = expectedName
        Assertions.assertEquals(expectedName, person.name)
    }

    @Test
    fun `Map attribute delegate`() {
        val person = PersonWithMapDelegate()

        val expected = "afsdafds"
        person.setAttribute("name", expected)

        Assertions.assertEquals(expected, person.name)
    }
}