package romannumerals

class RomanNumerals {

    fun from(number: Int) =
        fromTo(number, (4000 to "MV"), (1000 to "M")) {
            val ninetyAndLess = { n: Int ->
                fromToMiddleDigit(n, (90 to "XC"), (50 to "L"), ::tenAndLess) { n ->
                    fromTo(n, (40 to "XL"), (10 to "X"), ::tenAndLess) }
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

    private fun tenAndLess(number: Int) =
        if (number >= 9)
            if (number == 9) "IX" else "X" + unit(number - 10)
        else if (number >= 4) {
            if (number == 4) "IV" else "V" + unit(number - 5)
        } else
            unit(number)

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