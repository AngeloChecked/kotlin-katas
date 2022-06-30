package bowlingrules

data class Frame(var rolls: Int, var score: Int, var bonus: Int = 0) {
    fun isStrike() = this.rolls == 1 && this.score == 10
    fun isFirstRoll() = this.rolls == 1 && this.score < 10
    fun isSpare() = this.rolls == 2 && this.score == 10
}

class BowlingRulesGame {
    private val frames = mutableListOf<Frame>()

    fun roll(score: Int) {
        val previousFrame = frames.getOrNull(frames.size - 1)
        val twoPreviousFrame = frames.getOrNull(frames.size - 2)

        if (twoPreviousFrame?.isStrike() == true) {
            frames[frames.size - 2].bonus += score
        }

        if (previousFrame?.isStrike() == true) {
            frames[frames.size - 1].bonus += score
        }

        if (previousFrame?.isSpare() == true) {
            frames[frames.size - 1].bonus += score
        }

        if (previousFrame?.isFirstRoll() == true) {
            frames[frames.size - 1].score += score
            frames[frames.size - 1].rolls = 2
        } else
            frames.add(Frame(rolls = 1, score = score))
    }


    fun score() = frames.sumOf { it.score + it.bonus }
}