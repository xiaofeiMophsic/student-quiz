/**
 * Integer Mod 3 Equality
 * Create a class IntegerMod3 that accepts
 * a single Int to the constructor and saves
 * that Int in a var property named value.
 * Override equals and consider two IntegerMod3
 * instances to be equal if their values are the same
 * after applying Kotlin's remainder operator %.
 * For example, 2, 5, and 8 all have the
 * remainder 2 when divided by 3.
 */
class IntegerMod3(
    var value: Int
) {

    override fun equals(other: Any?): Boolean {
        return when (javaClass) {
            other?.javaClass -> {
                other as IntegerMod3
                value % 3 == other.value % 3
            }
            else -> false
        }
    }
}

fun main() {
    // for test
    val first = IntegerMod3(2)
    val second = IntegerMod3(5)
    val third = IntegerMod3(8)

    println(first == second)
    println(second == third)
}
