// Write a method that takes in a polynomial as a string and gives back the derivative as a string.

// Input: 2x^3 + 4x^2 + 9x
// Output: 6x^2 + 8x + 9

fun main() {
    val input1 = "2x^3 + 4x^2 + 9x"
    println(derivePoly(input1))
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

/*
fun String.derivePoly(): String {
    val myItem = split(" + ")

    val firstItem = myItem[0].first().digitToInt() * 3
    val firstItemLast = myItem[0].last().digitToInt() - 1

    val secondItem = myItem[1].split("^").first().find { it == '4' }?.digitToInt()?.times(2)
    val thirdItem = myItem[2].first().digitToInt()

    return "${firstItem}x^${firstItemLast} + ${secondItem}x + $thirdItem"
}
*/
