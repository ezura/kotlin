// IS_APPLICABLE: false

fun <T> foo(list: List<T>): Int = 0

fun bar(): Int {
    return foo(listOf<caret><String>())
}