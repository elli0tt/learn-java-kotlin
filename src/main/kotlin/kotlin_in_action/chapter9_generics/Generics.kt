package kotlin_in_action.chapter9_generics

fun <T> multipleBoundariesForGenericType() where T: CharSequence, T: Comparable<CharSequence> {

}