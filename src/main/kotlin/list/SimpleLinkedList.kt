package list

open class SimpleLinkedList(values: Array<Any?>) : SimpleList {
    private inner class Item(var value: Any?, var next: Item?)

    private var start: Item? = null
    private var size = 0

    init {
        for (i in values.indices.reversed()) {
            add(0, values[i])
        }
    }

    fun size() = size

    override fun get(index: Int): Any? {
        var s: Item? = start ?: return null
        var i = 0
        while (s != null) {
            if (i++ == index) {
                return s
            }
            s = s.next
        }
        return null
    }

    fun getAll(): List<Any?> {
        val result = mutableListOf<Any>()
        var s: Item? = start
        while (s != null) {
            result.add(s)
            s = s.next
        }
        return result
    }

    override fun set(index: Int, newValue: Any?) {
        TODO("Not implemented")
    }
    override fun remove(index: Int): Any? {
        TODO("Not implemented!")
    }
    override fun add(index: Int, value: Any?) {
        require(index == 0) { "Non-zero add not supported yet" }
        start = Item(value, start)
        size++
    }
}