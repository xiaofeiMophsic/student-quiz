
fun findTriplets(array: Array<out Any>): Boolean {
    if (array.size < 3)
        throw IllegalArgumentException("")

    var front = array[0]
    var mid = array[1]
    var back = array[2]

    // Point to the last element within triplet.
    var index = 2
    do {
        // If you find a triplet, immediately return true.
        if (isTripletsReferenceEquals(front, mid, back)) {
            return true
            //equality triplet—three adjacent objects with equal values, throw an IllegalArgumentException
        } else if (isTripletsEquality(front, mid, back)) {
            throw IllegalArgumentException()
        }

        // Move the triplet front to back step by step until to the last element.
        index++
        if (index < array.lastIndex) {
            front = mid
            mid = back
            back = array[index]
        }
    } while (index < array.size)

    return false
}

private fun isTripletsReferenceEquals(a: Any, b: Any, c: Any): Boolean {
    return a === b && b === c
}

private fun isTripletsEquality(a: Any, b: Any, c: Any): Boolean {
    return a == b && b == c
}

fun main() {
    // For test
    val tom = Student("Tom")
    val bob = Student("Bob")
    val jerry = Student("jerry")

    val array1 = arrayOf(tom, tom, tom)
    println(findTriplets(array1)) // true

    val array2 = arrayOf(tom, bob, jerry)
    println(findTriplets(array2)) // false

    val array3 = arrayOf(tom, tom, Student("Tom"))
    println(findTriplets(array3)) // throw IllegalArgumentException
}

data class Student(val name: String)