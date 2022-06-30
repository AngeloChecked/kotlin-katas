package bowlingrules

data class Frame(var rolls: Int, var score: Int, var bonus: Int = 0)

class BowlingRulesGame {
    private val frames = mutableListOf<Frame>()

    fun roll(score: Int) {
        val previousFrame = frames.getOrNull(frames.size-1)
        val twoPreviousFrame = frames.getOrNull(frames.size-2)

        if (frameIsStrike(twoPreviousFrame)){
            frames[frames.size-2].bonus += score
            return
        }

        if (frameIsStrike(previousFrame)){
            frames[frames.size-1].bonus += score
            return
        }

        if (isFirstRollOfFrame(previousFrame)){
            frames[frames.size-1].score += score
            frames[frames.size-1].rolls = 2
            return
        }

        if (frameIsSpare(previousFrame)){
            frames[frames.size-1].bonus += score
            frames.add(Frame(rolls=1, score=score))
            return
        }

        frames.add(Frame(rolls=1, score=score))
    }

    private fun frameIsStrike(previousFrame: Frame?) =
        previousFrame != null && previousFrame.rolls == 1 && previousFrame.score == 10

    private fun isFirstRollOfFrame(previousFrame: Frame?) =
        previousFrame != null && previousFrame.rolls == 1 && previousFrame.score < 10

    private fun frameIsSpare(previousFrame: Frame?) =
        previousFrame != null && previousFrame.rolls == 2 && previousFrame.score == 10

    fun score() = frames.sumOf { it.score+it.bonus }
}