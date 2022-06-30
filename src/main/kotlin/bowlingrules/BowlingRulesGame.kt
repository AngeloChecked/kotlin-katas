package bowlingrules

data class Frame(
    private var rolls: Int = 1,
    private var score: Int,
    private var bonus: Int = 0
) {
    fun isStrike() = this.rolls == 1 && this.score == 10
    fun isFirstRoll() = this.rolls == 1 && this.score < 10
    fun isSpare() = this.rolls == 2 && this.score == 10
    fun addBonus(bonus: Int) {
        this.bonus += bonus
    }

    fun addScore(score: Int) {
        this.score += score
    }

    fun secondRoll() {
        rolls = 2
    }

    fun score(): Int {
        return this.score + this.bonus
    }
}

class BowlingRulesGame {
    private val frames = mutableListOf<Frame>()

    fun roll(score: Int) {
        val previousFrame = frames.getOrNull(frames.size - 1)
        val twoPreviousFrame = frames.getOrNull(frames.size - 2)

        if (twoPreviousFrame?.isStrike() == true) {
            frames[frames.size - 2].addBonus(score)
        }

        if (previousFrame?.isStrike() == true) {
            frames[frames.size - 1].addBonus(score)
        }

        if (previousFrame?.isSpare() == true) {
            frames[frames.size - 1].addBonus(score)
        }

        if (previousFrame?.isFirstRoll() == true) {
            frames[frames.size - 1].addScore(score)
            frames[frames.size - 1].secondRoll()
        } else
            frames.add(Frame(score = score))
    }


    fun score() = frames.sumOf { it.score() }
}