package kotlin_in_action.chapter7_operators

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PersonWithDelegate(val name: String, observablePropery: Int, vetoableProperty: Int) {

    var observableProperty: Int by Delegates.observable(observablePropery) { property, oldValue, newValue ->
        println("Property ${property.name} is changed from $oldValue to $newValue")
    }

    var vetoableProperty: Int by Delegates.vetoable(vetoableProperty) { property, oldValue, newValue ->
        println("Property ${property.name} won't be changed from $oldValue to $newValue")
        false
    }

    var notNullProperty: Int by Delegates.notNull()
}

class PersonWithLoggerDelegate(name: String) {

    var name by LoggerDelegate<String>()
}

class LoggerDelegate<V : Any>() {
    private lateinit var value: V

    operator fun getValue(obj: Any, property: KProperty<*>): V {
        println("get() called for ${property.name}, ")
        return value
    }

    operator fun setValue(obj: Any, property: KProperty<*>, newValue: V) {
        println("set called for ${property.name}")
        value = newValue
    }
}

class PersonWithMapDelegate {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
}