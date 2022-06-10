package anagrams

import kotlin.streams.toList

class Anagrams {
    fun generateFor(name: String): List<String> {
        if (name.length == 1) return listOf(name)
        val nameChars = name.chars().toList()
        fun findEasierPermutations(start: List<Int>): List<List<Int>> =
            start.map {
                start.fold(listOf(it)) { acc, elem ->
                    if (it == elem) acc else acc + elem
                }
            }
        val foundedPermutationsOfPreviousPermutationsXTimes =
            (1 until nameChars.size).fold(listOf(nameChars)) { previousPermutations, _ ->
                previousPermutations.flatMap { findEasierPermutations(it) }
            }
        return fromIntListToStringList(foundedPermutationsOfPreviousPermutationsXTimes)
            .toSet().toList()
    }

    private fun fromIntListToStringList(listOfIntList: List<List<Int>>) =
        listOfIntList.map { numChars ->
            numChars.map { it.toChar() }.joinToString("")
        }
}