// Write a method that takes in a polynomial as a string and gives back the derivative as a string.

// Input: 2x^3 + 4x^2 + 9x
// Output: 6x^2 + 8x + 9

fun main() {
    val input1 = "2x^3 + 4x^2 + 9x"
    println(derivePoly(input1))
    println(input1.derivative())
}

fun derivePoly(inputString: String): String {
    with(inputString) {
        val input = split(" + ")

        val firstOutput = input
            .map { it.split("x").first() } // ["2", "4", "9"]

        val firstItemLast = input[0].last() - 1 // 2
        val firstItem = firstOutput[0].toInt() * 3 // 6

        val secondItem = firstOutput[1].toInt() * 2 // 8
        val thirdItem = firstOutput[2].toInt() // 9

        return "${firstItem}x^${firstItemLast} + ${secondItem}x + $thirdItem"
    }
}

/**
 * Extension function to derive a polynomial
 * @return the derivative of the polynomial
 */

fun String.derivative(): String {
    val input = split(" + ")

    val firstOutput = input
        .map { it.split("x").first() } // ["2", "4", "9"]

    val firstItemLast = input[0].last() - 1 // 2
    val firstItem = firstOutput[0].toInt() * 3 // 6

    val secondItem = firstOutput[1].toInt() * 2 // 8
    val thirdItem = firstOutput[2].toInt() // 9

    return "${firstItem}x^${firstItemLast} + ${secondItem}x + $thirdItem"
}
