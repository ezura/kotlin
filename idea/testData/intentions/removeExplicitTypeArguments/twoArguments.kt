// IS_APPLICABLE: true

fun <T> foo(p1: List<T>, p2: List<T>) {
}

fun bar() {
    foo(listOf<caret><String>(), listOf<String>())
}
