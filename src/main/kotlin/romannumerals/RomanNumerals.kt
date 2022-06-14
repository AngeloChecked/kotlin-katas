package romannumerals

class RomanNumerals {
    fun from(number: Int): String {
        val hundredMultiplayer = number.div(100)
        val hundreds = "C".repeat(hundredMultiplayer)
        if (number >= 100)
            return hundreds + ninetyAndLess(number - (100) * hundredMultiplayer)
        return ninetyAndLess(number)
    }

    private fun fortyAndLess(number: Int): String {
        if (number >= 40)
            return "XL" + tenAndLess(number - 40)
        val tenMultipliers = number.div(10)
        val numberWithoutTens = number - (10 * (tenMultipliers))
        val tens = "X".repeat(tenMultipliers)
        return tens + tenAndLess(numberWithoutTens)
    }

    private fun ninetyAndLess(number: Int): String {
        return if (number >= 90)
            "XC" + tenAndLess(number - 90)
        else if (number >= 50)
            "L" + fortyAndLess(number - 50)
        else
            fortyAndLess(number)
    }

    private fun tenAndLess(numberWithoutTens: Int) = if (numberWithoutTens >= 9)
        tenUnit(numberWithoutTens)
    else if (numberWithoutTens >= 4) {
        fiveUnit(numberWithoutTens)
    } else
        unit(numberWithoutTens)

    private fun tenUnit(number: Int): String {
        val rest10 = number % 10
        return if (number == 9)
            "IX"
        else
            "X" + unit(rest10)
    }

    private fun fiveUnit(number: Int): String {
        val rest5 = number % 5
        return if (number == 4)
            "IV"
        else
            "V" + unit(rest5)
    }

    private fun unit(rest: Int) = "I".repeat(rest)
}