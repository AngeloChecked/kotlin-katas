package anagrams

import kotlin.streams.toList

class Anagrams2 {

    private fun findAnagrams(input: List<Int>): List<List<Int>> {
        if (input.size == 1) return listOf(input)
        val permutations = mutableListOf<List<Int>>()
        for (chars in findAnagrams(input.drop(1))) {
            for (time in 0..chars.size) {
                val charsToStore = chars.toMutableList()
                charsToStore.add(time, input.first())
                permutations.add(charsToStore)
            }
        }
        return permutations
    }

    fun generateFor(name: String): List<String> {
        if (name.length == 1) return listOf(name)
        val chars = name.chars().toList()
        return findAnagrams(chars).map(::intsToStr)
    }

    private fun intsToStr(cars: List<Int>) = cars.map { it.toChar() }.joinToString("")

}