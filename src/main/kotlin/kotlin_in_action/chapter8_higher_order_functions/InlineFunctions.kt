package kotlin_in_action.chapter8_higher_order_functions

inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {

}

fun returnFromFunction(): List<Int> {
    val list = listOf(1, 2, 3, 4, 5)

    val resultList = arrayListOf<Int>()

    list.forEach {
        if (it % 2 == 0) {
            resultList.add(it)
            return@forEach
        }
    }
    return resultList
}

fun returnFromLambda(): List<Int> {
    val list = listOf(1, 2, 3, 4, 5)

    val resultList = arrayListOf<Int>()

    list.forEach(fun(item) {
        if (item % 2 == 0) {
            resultList.add(item)
            return
        }
    })
    return resultList
}