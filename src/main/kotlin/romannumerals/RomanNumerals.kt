package romannumerals

class RomanNumerals {
    fun from(number: Int) =
        fromTo(number, (4000 to "MV"), (1000 to "M"), ::nineHundredAndLess)

    private fun nineHundredAndLess(number: Int) =
        if (number >= 900)
            "CM" + ninetyAndLess(number - 900)
        else if (number >= 500)
            "D" + fourHundredAndLess(number - 500)
        else
            fourHundredAndLess(number)

    private fun fourHundredAndLess(number: Int) =
        fromTo(number, (400 to "CD"), (100 to "C"), ::ninetyAndLess)

    private fun ninetyAndLess(number: Int) =
        if (number >= 90)
            "XC" + tenAndLess(number - 90)
        else if (number >= 50)
            "L" + fortyAndLess(number - 50)
        else
            fortyAndLess(number)

    private fun fortyAndLess(number: Int) =
        fromTo(number, (40 to "XL"), (10 to "X"), ::tenAndLess)

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