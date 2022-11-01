package list;

interface SimpleList {
    fun get(index: Int): Any?
    fun set(index: Int, value: Any?)
    fun remove(index: Int): Any?
    fun add(index: Int, value: Any?)
}

open class SimpleArrayList(private var values: Array<Any?>) : SimpleList {
    override fun get(index: Int): Any? {
        require(index in values.indices)
        return values[index]
    }

    override fun set(index: Int, value: Any?) {
        require(index in values.indices)
        values[index] = value
    }

    override fun remove(index: Int): Any? {
        TODO("Not implemented!")
    }

    override fun add(index: Int, value: Any?) {
        TODO("Not implemented!")
    }

    override fun toString() = values.contentToString()
}

fun main() {
    val list = SimpleArrayList(arrayOf("you", "are", "not", "alone"))
    println(list.get(0))
    list.set(2, "NOT")
    println(list)
}