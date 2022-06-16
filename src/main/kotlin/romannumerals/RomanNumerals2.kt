package romannumerals

class RomanNumerals2 {

    private val romanNumbersMapping = listOf(
        (1 to "I"),
        (4 to "IV"),
        (5 to "V"),
        (9 to "IX"),
        (10 to "X"),
        (40 to "XL"),
        (50 to "L"),
        (90 to "XC"),
        (100 to "C"),
        (400 to "CD"),
        (500 to "D"),
        (900 to "CM"),
        (1000 to "M"),
        (4000 to "MW"),
        (5000 to "W"),
    )

    fun from(number: Int): String {
        val (digit, symbol) = digitSymbol(number)
        if (number >= digit)
            return symbol + from(number - digit)
        return ""
    }

    private fun digitSymbol(number: Int): Pair<Int, String> {
        val nextDigitIndex = romanNumbersMapping.indexOfFirst { (digit, _) -> digit > number }
        return romanNumbersMapping.getOrNull(nextDigitIndex - 1) ?: romanNumbersMapping[nextDigitIndex]
    }

}