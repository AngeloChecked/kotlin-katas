package anagrams

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AnagramsTest {
    @Test
    fun `an letter anagrams`() {
        val anagrams = Anagrams().generateFor("i")

        assertEquals(listOf("i"), anagrams)
    }

    @Test
    fun `two letters anagrams`() {
        val anagrams = Anagrams().generateFor("ia")

        assertEquals(listOf("ia", "ai"), anagrams)
    }

    @Test
    fun `three letters anagrams`() {
        val anagrams = Anagrams().generateFor("abc")

        assertEquals(listOf("abc", "bac", "cab", "cba", "acb", "bca"), anagrams)
    }

    @Test
    fun `four letters anagrams`() {
        val anagrams = Anagrams().generateFor("abcd")

        assertEquals(
            listOf(
                "abcd",
                "bacd",
                "cabd",
                "dabc",
                "cbad",
                "dbac",
                "acbd",
                "bcad",
                "dcab",
                "adbc",
                "bdac",
                "cdab",
                "dcba",
                "cdba",
                "dacb",
                "dbca",
                "adcb",
                "bdca",
                "badc",
                "cadb",
                "abdc",
                "cbda",
                "acdb",
                "bcda"
            ), anagrams
        )
    }

    @Test
    fun `five letters anagrams`() {
        val anagrams = Anagrams().generateFor("abcde")

        assertEquals(
            listOf(
                "abcde", "bacde", "cabde", "dabce", "eabcd", "cbade", "dbace", "ebacd", "acbde", "bcade",
                "dcabe", "ecabd", "adbce", "bdace", "cdabe", "edabc", "aebcd", "beacd", "ceabd", "deabc",
                "dcbae", "ecbad", "cdbae", "edbac", "cebad", "debac", "dacbe", "eacbd", "dbcae", "ebcad",
                "adcbe", "bdcae", "edcab", "aecbd", "becad", "decab", "badce", "cadbe", "eadbc", "abdce",
                "cbdae", "ebdac", "acdbe", "bcdae", "ecdab", "aedbc", "bedac", "cedab", "baecd", "caebd",
                "daebc", "abecd", "cbead", "dbeac", "acebd", "bcead", "dceab", "adebc", "bdeac", "cdeab",
                "edcba", "decba", "ecdba", "cedba", "dceba", "cdeba", "edacb", "deacb", "edbca", "debca",
                "eadcb", "ebdca", "aedcb", "bedca", "daecb", "dbeca", "adecb", "bdeca", "ebadc", "ecadb",
                "beadc", "ceadb", "eabdc", "ecbda", "aebdc", "cebda", "eacdb", "ebcda", "aecdb", "becda",
                "baedc", "caedb", "abedc", "cbeda", "acedb", "bceda", "cbaed", "dbaec", "bcaed", "dcaeb",
                "bdaec", "cdaeb", "cabed", "dabec", "acbed", "dcbea", "adbec", "cdbea", "baced", "daceb",
                "abced", "dbcea", "adceb", "bdcea", "badec", "cadeb", "abdec", "cbdea", "acdeb", "bcdea"
            ),
            anagrams
        )
    }
}