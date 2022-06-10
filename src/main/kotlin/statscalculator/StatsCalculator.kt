package statscalculator

import java.security.InvalidAlgorithmParameterException

class StatsCalculator {
    fun calculate(numbers: List<Int>): Map<String, Double> {
        val minimum = numbers.minOrNull() ?: throw InvalidAlgorithmParameterException()
        val maximum = numbers.maxOrNull() ?: throw InvalidAlgorithmParameterException()
        return mapOf(
            "minimum" to minimum.toDouble(),
            "maximum" to maximum.toDouble(),
            "count" to numbers.size.toDouble(),
            "average" to numbers.sum().toDouble()/numbers.size
        )
    }
}