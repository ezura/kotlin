class ListWrapper<T>(val x: List<T>)

val list: ListWrapper<Int> = ListWrapper(listOf<caret><Int>())