import kotlin.math.max

fun main() {
    // For test
    val anyArray: Array<Any> = arrayOf(1, "abc", 4, "def")
    println(score(anyArray))
}

fun score(array: Array<Any>): Int{
    // int value
    var scoreOfBanjo = 0
    // string length
    var scoreOfGracie = 0

    array.forEach {
        when (it) {
            is String -> {
                scoreOfGracie += it.length
            }
            is Int -> {
                scoreOfBanjo += it
            }
            else ->
                throw IllegalArgumentException()
        }
    }

    return max(scoreOfBanjo, scoreOfGracie)
}