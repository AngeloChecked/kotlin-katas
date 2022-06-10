package statscalculator

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StatsCalculatorTest {

    @Test
    fun `calculate values of one number`() {
        val statsCalculator = StatsCalculator()

        val result = statsCalculator.calculate(listOf(1))

        val expectedResult = mapOf(
            "minimum" to 1.0,
            "maximum" to 1.0,
            "count" to 1.0,
            "average" to 1.0,
        )
        assertEquals(expectedResult,result)
    }

    @Test
    fun `calculate values of two numbers`() {
        val statsCalculator = StatsCalculator()

        val result = statsCalculator.calculate(listOf(1,2))

        val expectedResult = mapOf(
            "minimum" to 1.0,
            "maximum" to 2.0,
            "count" to 2.0,
            "average" to 1.5
        )
        assertEquals(expectedResult,result)
    }

    @Test
    fun `calculate values of three numbers`() {
        val statsCalculator = StatsCalculator()

        val result = statsCalculator.calculate(listOf(1,2,3))

        val expectedResult = mapOf(
            "minimum" to 1.0,
            "maximum" to 3.0,
            "count" to 3.0,
            "average" to 2.0
        )
        assertEquals(expectedResult,result)
    }

    @Test
    fun `calculate values of four numbers`() {
        val statsCalculator = StatsCalculator()

        val result = statsCalculator.calculate(listOf(1,2,3,4))

        val expectedResult = mapOf(
            "minimum" to 1.0,
            "maximum" to 4.0,
            "count" to 4.0,
            "average" to 2.5
        )
        assertEquals(expectedResult,result)
    }
}
