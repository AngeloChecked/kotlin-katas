package bowlingrules

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class BowlingRulesGameTest {

    @Test
    fun `knock down 1 pin, the score is 1`() {
        val game = BowlingRulesGame()

        game.roll(1)
        val score = game.score()

        assertEquals(1, score)
    }

    @Test
    fun `knock down 1 and 7 pin, the score is 8`() {
        val game = BowlingRulesGame()

        game.roll(1)
        game.roll(7)
        val score = game.score()

        assertEquals(8, score)
    }

    @Test
    fun `knock down 10 pin in 2 roll is spare, the player gain bonus of the next roll`() {
        val game = BowlingRulesGame()

        game.roll(3)
        game.roll(7)
        game.roll(3)
        val score = game.score()

        assertEquals(10+3+3, score)
    }

    @Test
    fun `knock down 10 pin in 1 roll is strike, the player gain bonus of the next two rolls`() {
        val game = BowlingRulesGame()

        game.roll(10)
        game.roll(3)
        game.roll(6)
        val score = game.score()

        assertEquals(10+3+6+3+6, score)
    }

}