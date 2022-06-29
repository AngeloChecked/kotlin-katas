package romannumerals

class RomanNumerals {
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

    fun from(number: Int) =
        fromTo(number, (4000 to "MV"), (1000 to "M")) {
            val ninetyAndLess = { n: Int ->
                fromToMiddleDigit(n, (90 to "XC"), (50 to "L"), ::rightSymbol) { n ->
                    fromTo(n, (40 to "XL"), (10 to "X"), ::rightSymbol)
                }
            }
            fromToMiddleDigit(it, (900 to "CM"), (500 to "D"), ninetyAndLess) { n ->
                fromTo(n, (400 to "CD"), (100 to "C"), ninetyAndLess)
            }

        }

    private fun fromToMiddleDigit(
        number: Int,
        oneLessNextDigit: Pair<Int, String>,
        halfNextDigit: Pair<Int, String>,
        firstCaseFn: (Int) -> String,
        secondCaseFn: (Int) -> String,
    ): String {
        val (halfNextDigitNumber, halfNextDigitSymbol) = halfNextDigit
        val (oneLessNextDigitNumber, oneLessNextDigitSymbol) = oneLessNextDigit
        return if (number >= oneLessNextDigitNumber)
            oneLessNextDigitSymbol + firstCaseFn(number - oneLessNextDigitNumber)
        else if (number >= halfNextDigitNumber)
            halfNextDigitSymbol + secondCaseFn(number - halfNextDigitNumber)
        else
            secondCaseFn(number)
    }

    private fun rightSymbol(number: Int): String {
        if (number == 0) return ""
        val nextDigitIndex = romanNumbersMapping.indexOfFirst { (num, _) -> num > number }
        val (digitNumber, digitSymbol) = romanNumbersMapping[nextDigitIndex - 1]
        return digitSymbol + unit(number - digitNumber)
    }

    private fun unit(rest: Int) = "I".repeat(rest)

    private fun fromTo(
        number: Int,
        fourHundred: Pair<Int, String>,
        hundred: Pair<Int, String>,
        nextFn: (Int) -> String
    ): String {
        val (hundredMultiplier, hundredSymbol) = hundred
        val (numberFourHundred, fourHundredSymbol) = fourHundred

        if (number >= numberFourHundred)
            return fourHundredSymbol + nextFn(number - numberFourHundred)

        val hundredMultiplayer = number.div(hundredMultiplier)
        val hundreds = hundredSymbol.repeat(hundredMultiplayer)
        return hundreds + nextFn(number - (hundredMultiplier * hundredMultiplayer))
    }
}