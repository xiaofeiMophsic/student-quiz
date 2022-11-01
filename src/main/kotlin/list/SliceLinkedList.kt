package list

class SliceLinkedList(val values: Array<Any?>): SimpleLinkedList(values) {

    fun slideEnd(many: Int): List<Any?> {
        if (many < 0) throw IllegalArgumentException()

        val size = size()
        if (many > size) {
            return getAll()
        }

        val result = mutableListOf<Any?>()
        var start = size - many
        while (start < size) {
            result.add(get(start))
            start++
        }
        return result
    }
}