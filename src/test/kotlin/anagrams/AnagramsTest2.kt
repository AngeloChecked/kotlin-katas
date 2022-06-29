package anagrams

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AnagramsTest2 {
    @Test
    fun `an letter anagrams`() {
        val anagrams = Anagrams2().generateFor("i")

        assertEquals(listOf("i"), anagrams)
    }

    @Test
    fun `two letters anagrams`() {
        val anagrams = Anagrams2().generateFor("ia")

        assertEquals(listOf("ia", "ai"), anagrams)
    }

    @Test
    fun `three letters anagrams`() {
        val anagrams = Anagrams2().generateFor("abc")

        assertEquals(listOf("abc", "bac", "bca", "acb", "cab", "cba"), anagrams)
    }

    @Test
    fun `four letters anagrams`() {
        val anagrams = Anagrams2().generateFor("abcd")

        assertEquals(
            listOf(
                "abcd",
                "bacd",
                "bcad",
                "bcda",
                "acbd",
                "cabd",
                "cbad",
                "cbda",
                "acdb",
                "cadb",
                "cdab",
                "cdba",
                "abdc",
                "badc",
                "bdac",
                "bdca",
                "adbc",
                "dabc",
                "dbac",
                "dbca",
                "adcb",
                "dacb",
                "dcab",
                "dcba"
            ), anagrams
        )
    }

    @Test
    fun `five letters anagrams`() {
        val anagrams = Anagrams2().generateFor("abcde")

        assertEquals(
            listOf(
                "abcde", "bacde", "bcade", "bcdae", "bcdea", "acbde", "cabde", "cbade", "cbdae",
                "cbdea", "acdbe", "cadbe", "cdabe", "cdbae", "cdbea", "acdeb", "cadeb", "cdaeb",
                "cdeab", "cdeba", "abdce", "badce", "bdace", "bdcae", "bdcea", "adbce", "dabce",
                "dbace", "dbcae", "dbcea", "adcbe", "dacbe", "dcabe", "dcbae", "dcbea", "adceb",
                "daceb", "dcaeb", "dceab", "dceba", "abdec", "badec", "bdaec", "bdeac", "bdeca",
                "adbec", "dabec", "dbaec", "dbeac", "dbeca", "adebc", "daebc", "deabc", "debac",
                "debca", "adecb", "daecb", "deacb", "decab", "decba", "abced", "baced", "bcaed",
                "bcead", "bceda", "acbed", "cabed", "cbaed", "cbead", "cbeda", "acebd", "caebd",
                "ceabd", "cebad", "cebda", "acedb", "caedb", "ceadb", "cedab", "cedba", "abecd",
                "baecd", "beacd", "becad", "becda", "aebcd", "eabcd", "ebacd", "ebcad", "ebcda",
                "aecbd", "eacbd", "ecabd", "ecbad", "ecbda", "aecdb", "eacdb", "ecadb", "ecdab",
                "ecdba", "abedc", "baedc", "beadc", "bedac", "bedca", "aebdc", "eabdc", "ebadc",
                "ebdac", "ebdca", "aedbc", "eadbc", "edabc", "edbac", "edbca", "aedcb", "eadcb",
                "edacb", "edcab", "edcba"
            ),
            anagrams
        )
    }
}