package romannumerals

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RomanNumeralsTest {

    @Test
    fun `should get the first roman number`() {
        val romanNumerals = RomanNumerals().from(1)
        assertEquals("I", romanNumerals)
    }

    @Test
    fun `should get the second roman number`() {
        val romanNumerals = RomanNumerals().from(2)
        assertEquals("II", romanNumerals)
    }

    @Test
    fun `should get the third roman number`() {
        val romanNumerals = RomanNumerals().from(3)
        assertEquals("III", romanNumerals)
    }

    @Test
    fun `should get the 4th roman number`() {
        val romanNumerals = RomanNumerals().from(4)
        assertEquals("IV", romanNumerals)
    }

    @Test
    fun `should get the 5th roman number`() {
        val romanNumerals = RomanNumerals().from(5)
        assertEquals("V", romanNumerals)
    }

    @Test
    fun `should get the 6th roman number`() {
        val romanNumerals = RomanNumerals().from(6)
        assertEquals("VI", romanNumerals)
    }

    @Test
    fun `should get the 7th roman number`() {
        val romanNumerals = RomanNumerals().from(7)
        assertEquals("VII", romanNumerals)
    }

    @Test
    fun `should get the 8th roman number`() {
        val romanNumerals = RomanNumerals().from(8)
        assertEquals("VIII", romanNumerals)
    }

    @Test
    fun `should get the 9th roman number`() {
        val romanNumerals = RomanNumerals().from(9)
        assertEquals("IX", romanNumerals)
    }

    @Test
    fun `should get the 10th roman number`() {
        val romanNumerals = RomanNumerals().from(10)
        assertEquals("X", romanNumerals)
    }

    @Test
    fun `should get the 11th roman number`() {
        val romanNumerals = RomanNumerals().from(11)
        assertEquals("XI", romanNumerals)
    }

    @Test
    fun `should get the 12th roman number`() {
        val romanNumerals = RomanNumerals().from(12)
        assertEquals("XII", romanNumerals)
    }

    @Test
    fun `should get the 13th roman number`() {
        val romanNumerals = RomanNumerals().from(13)
        assertEquals("XIII", romanNumerals)
    }

    @Test
    fun `should get the 14th roman number`() {
        val romanNumerals = RomanNumerals().from(14)
        assertEquals("XIV", romanNumerals)
    }

    @Test
    fun `should get the 15th roman number`() {
        val romanNumerals = RomanNumerals().from(15)
        assertEquals("XV", romanNumerals)
    }

    @Test
    fun `should get the 16th roman number`() {
        val romanNumerals = RomanNumerals().from(16)
        assertEquals("XVI", romanNumerals)
    }

    @Test
    fun `should get the 17th roman number`() {
        val romanNumerals = RomanNumerals().from(17)
        assertEquals("XVII", romanNumerals)
    }

    @Test
    fun `should get the 18th roman number`() {
        val romanNumerals = RomanNumerals().from(18)
        assertEquals("XVIII", romanNumerals)
    }

    @Test
    fun `should get the 19th roman number`() {
        val romanNumerals = RomanNumerals().from(19)
        assertEquals("XIX", romanNumerals)
    }

    @Test
    fun `should get the 20th roman number`() {
        val romanNumerals = RomanNumerals().from(20)
        assertEquals("XX", romanNumerals)
    }

    @Test
    fun `should get the 21th roman number`() {
        val romanNumerals = RomanNumerals().from(21)
        assertEquals("XXI", romanNumerals)
    }

    @Test
    fun `should get the 22th roman number`() {
        val romanNumerals = RomanNumerals().from(22)
        assertEquals("XXII", romanNumerals)
    }

    @Test
    fun `should get the 23th roman number`() {
        val romanNumerals = RomanNumerals().from(23)
        assertEquals("XXIII", romanNumerals)
    }

    @Test
    fun `should get the 24th roman number`() {
        val romanNumerals = RomanNumerals().from(24)
        assertEquals("XXIV", romanNumerals)
    }

    @Test
    fun `should get the 25th roman number`() {
        val romanNumerals = RomanNumerals().from(25)
        assertEquals("XXV", romanNumerals)
    }

    @Test
    fun `should get the 26th roman number`() {
        val romanNumerals = RomanNumerals().from(26)
        assertEquals("XXVI", romanNumerals)
    }

    @Test
    fun `should get the 29th roman number`() {
        val romanNumerals = RomanNumerals().from(29)
        assertEquals("XXIX", romanNumerals)
    }

    @Test
    fun `should get the 30th roman number`() {
        val romanNumerals = RomanNumerals().from(30)
        assertEquals("XXX", romanNumerals)
    }

    @Test
    fun `should get the 40th roman number`() {
        val romanNumerals = RomanNumerals().from(40)
        assertEquals("XL", romanNumerals)
    }

    @Test
    fun `should get the 41th roman number`() {
        val romanNumerals = RomanNumerals().from(41)
        assertEquals("XLI", romanNumerals)
    }

    @Test
    fun `should get the 42th roman number`() {
        val romanNumerals = RomanNumerals().from(42)
        assertEquals("XLII", romanNumerals)
    }

    @Test
    fun `should get the 44th roman number`() {
        val romanNumerals = RomanNumerals().from(44)
        assertEquals("XLIV", romanNumerals)
    }

    @Test
    fun `should get the 49th roman number`() {
        val romanNumerals = RomanNumerals().from(49)
        assertEquals("XLIX", romanNumerals)
    }

    @Test
    fun `should get the 50th roman number`() {
        val romanNumerals = RomanNumerals().from(50)
        assertEquals("L", romanNumerals)
    }

    @Test
    fun `should get the 51th roman number`() {
        val romanNumerals = RomanNumerals().from(51)
        assertEquals("LI", romanNumerals)
    }

    @Test
    fun `should get the 52th roman number`() {
        val romanNumerals = RomanNumerals().from(52)
        assertEquals("LII", romanNumerals)
    }

    @Test
    fun `should get the 54th roman number`() {
        val romanNumerals = RomanNumerals().from(54)
        assertEquals("LIV", romanNumerals)
    }

    @Test
    fun `should get the 59th roman number`() {
        val romanNumerals = RomanNumerals().from(59)
        assertEquals("LIX", romanNumerals)
    }

    @Test
    fun `should get the 89th roman number`() {
        val romanNumerals = RomanNumerals().from(89)
        assertEquals("LXXXIX", romanNumerals)
    }

    @Test
    fun `should get the 90th roman number`() {
        val romanNumerals = RomanNumerals().from(90)
        assertEquals("XC", romanNumerals)
    }

    @Test
    fun `should get the 91th roman number`() {
        val romanNumerals = RomanNumerals().from(91)
        assertEquals("XCI", romanNumerals)
    }

    @Test
    fun `should get the 92th roman number`() {
        val romanNumerals = RomanNumerals().from(92)
        assertEquals("XCII", romanNumerals)
    }

    @Test
    fun `should get the 99th roman number`() {
        val romanNumerals = RomanNumerals().from(99)
        assertEquals("XCIX", romanNumerals)
    }

    @Test
    fun `should get the 100th roman number`() {
        val romanNumerals = RomanNumerals().from(100)
        assertEquals("C", romanNumerals)
    }

    @Test
    fun `should get the 101th roman number`() {
        val romanNumerals = RomanNumerals().from(101)
        assertEquals("CI", romanNumerals)
    }

    @Test
    fun `should get the 139th roman number`() {
        val romanNumerals = RomanNumerals().from(139)
        assertEquals("CXXXIX", romanNumerals)
    }

    @Test
    fun `should get the 199th roman number`() {
        val romanNumerals = RomanNumerals().from(199)
        assertEquals("CXCIX", romanNumerals)
    }

    @Test
    fun `should get the 399th roman number`() {
        val romanNumerals = RomanNumerals().from(399)
        assertEquals("CCCXCIX", romanNumerals)
    }

    @Test
    fun `should get the 400th roman number`() {
        val romanNumerals = RomanNumerals().from(400)
        assertEquals("CD", romanNumerals)
    }

    @Test
    fun `should get the 401th roman number`() {
        val romanNumerals = RomanNumerals().from(401)
        assertEquals("CDI", romanNumerals)
    }

    @Test
    fun `should get the 439th roman number`() {
        val romanNumerals = RomanNumerals().from(439)
        assertEquals("CDXXXIX", romanNumerals)
    }

    @Test
    fun `should get the 500th roman number`() {
        val romanNumerals = RomanNumerals().from(500)
        assertEquals("D", romanNumerals)
    }

    @Test
    fun `should get the 501th roman number`() {
        val romanNumerals = RomanNumerals().from(501)
        assertEquals("DI", romanNumerals)
    }

    @Test
    fun `should get the 539th roman number`() {
        val romanNumerals = RomanNumerals().from(539)
        assertEquals("DXXXIX", romanNumerals)
    }

    @Test
    fun `should get the 599th roman number`() {
        val romanNumerals = RomanNumerals().from(599)
        assertEquals("DXCIX", romanNumerals)
    }

    @Test
    fun `should get the 900th roman number`() {
        val romanNumerals = RomanNumerals().from(900)
        assertEquals("CM", romanNumerals)
    }

    @Test
    fun `should get the 999th roman number`() {
        val romanNumerals = RomanNumerals().from(999)
        assertEquals("CMXCIX", romanNumerals)
    }

    @Test
    fun `should get the 1000th roman number`() {
        val romanNumerals = RomanNumerals().from(1000)
        assertEquals("M", romanNumerals)
    }

    @Test
    fun `should get the 1439th roman number`() {
        val romanNumerals = RomanNumerals().from(1439)
        assertEquals("MCDXXXIX", romanNumerals)
    }

}