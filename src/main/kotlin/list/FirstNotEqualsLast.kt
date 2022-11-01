package list


// zero-arguments ?
class FirstNotEqualsLast(val values: Array<Any?>) : SimpleArrayList(values) {

    fun firstNotEqualsLast(): Boolean {
        if (values.isEmpty())
            throw IllegalArgumentException()
        return values.first() != values.last()
    }
}

fun compare(first: List<Int>, second: List<Int>): Int {
    if (first.isEmpty() || second.isEmpty()) {
        throw IllegalArgumentException()
    }

    return first.max() - second.max()
}