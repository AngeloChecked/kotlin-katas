package pokerhands

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PokerHandsTest {

    @Test
    fun `the hands are even - no higher hand`() {
        val leftHand = listOf(
            Card(2, "C"),
            Card(4, "D"),
            Card(5, "H"),
            Card(7, "S"),
            Card(10, "S"),
        )
        val rightHand = listOf(
            Card(2, "S"),
            Card(4, "C"),
            Card(5, "H"),
            Card(7, "H"),
            Card(10, "D"),
        )

        val winner = PokerHands().whichWin(leftHand, rightHand)

        assertEquals("Tie.", winner)
    }

    @Test
    fun `high card win`() {
        val leftHand = listOf(
            Card(2, "C"),
            Card(4, "D"),
            Card(5, "H"),
            Card(7, "S"),
            Card(10, "S"),
        )
        val rightHand = listOf(
            Card(2, "S"),
            Card(4, "C"),
            Card(5, "H"),
            Card(7, "H"),
            Card(14, "D"),
        )

        val winner = PokerHands().whichWin(leftHand, rightHand)

        assertEquals("right hand wins. - with high card: A", winner)
    }

    @Test
    fun `normal hand vs pair - pair win`() {
        val leftHand = listOf(
            Card(2, "C"),
            Card(2, "D"),

            Card(5, "H"),
            Card(7, "S"),
            Card(10, "S"),
        )
        val rightHand = listOf(
            Card(2, "S"),
            Card(4, "C"),
            Card(5, "H"),
            Card(7, "H"),
            Card(14, "D"),
        )

        val winner = PokerHands().whichWin(leftHand, rightHand)

        assertEquals("left hand wins. - with pair: 2C 2D", winner)
    }

    @Test
    fun `pair vs pair - higher pair win`() {
        val leftHand = listOf(
            Card(2, "C"),
            Card(2, "D"),

            Card(5, "H"),
            Card(7, "S"),
            Card(10, "S"),
        )
        val rightHand = listOf(
            Card(4, "S"),
            Card(4, "C"),

            Card(5, "H"),
            Card(7, "H"),
            Card(14, "D"),
        )

        val winner = PokerHands().whichWin(leftHand, rightHand)

        assertEquals("right hand wins. - with pair: 4S 4C", winner)
    }

    @Test
    fun `pair vs pair - even pairs - highest card wins`() {
        val leftHand = listOf(
            Card(2, "C"),
            Card(2, "D"),

            Card(5, "H"),
            Card(7, "S"),
            Card(10, "S"),
        )
        val rightHand = listOf(
            Card(2, "S"),
            Card(2, "C"),

            Card(5, "H"),
            Card(7, "H"),
            Card(14, "D"),
        )

        val winner = PokerHands().whichWin(leftHand, rightHand)

        assertEquals("right hand wins. - with even pair, higher card: A", winner)
    }

    @Test
    fun `pair vs pair - Tie`() {
        val leftHand = listOf(
            Card(2, "C"),
            Card(2, "D"),

            Card(5, "H"),
            Card(7, "S"),
            Card(10, "S"),
        )
        val rightHand = listOf(
            Card(2, "S"),
            Card(2, "C"),

            Card(5, "H"),
            Card(7, "H"),
            Card(10, "D"),
        )

        val winner = PokerHands().whichWin(leftHand, rightHand)

        assertEquals("Tie. - with even pair, even cars.", winner)
    }
}