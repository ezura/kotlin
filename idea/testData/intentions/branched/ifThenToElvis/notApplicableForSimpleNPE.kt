// IS_APPLICABLE: false
fun main(args: Array<String>) {
    val t: String? = "abc"
    if (t == null<caret>) throw NullPointerException() else t
}
