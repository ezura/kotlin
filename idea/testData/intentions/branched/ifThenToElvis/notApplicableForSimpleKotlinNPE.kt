// IS_APPLICABLE: false
fun main(args: Array<String>) {
    val t: String? = "abc"
    if (t != null<caret>) t else throw KotlinNullPointerException()
}
