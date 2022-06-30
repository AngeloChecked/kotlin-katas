package pokerhands

data class Card(val rank: Int, val symbol: String) {
    private val numberFormat = mapOf(
        2 to "2",
        3 to "3",
        4 to "4",
        5 to "5",
        6 to "6",
        7 to "7",
        8 to "8",
        9 to "9",
        10 to "T",
        11 to "J",
        12 to "Q",
        13 to "K",
        14 to "A",
    )

    fun valueString() = numberFormat[this.rank]

    override fun toString(): String {
        return numberFormat[this.rank] + this.symbol
    }
}

fun List<Card>.format() = this.joinToString(" ")

class PokerHands {
    fun whichWin(leftHand: List<Card>, rightHand: List<Card>): String {
        val pairsInLeftHand = handPairs(leftHand)
        val pairsInRightHand = handPairs(rightHand)
        if (listOf(pairsInLeftHand, pairsInRightHand).any { it.isNotEmpty() }) {
            val leftHandPair = pairsInLeftHand.firstOrNull()
            val rightHandPair = pairsInRightHand.firstOrNull()
            return pairVsNone(pairsInRightHand, leftHandPair, pairsInLeftHand, rightHandPair)
                ?: higherPair(leftHandPair!!, rightHandPair!!)
                ?: evenPairs(leftHand, leftHandPair!!, rightHand, rightHandPair!!)
        }
        val leftHandMax = maxCard(leftHand)
        val rightHandMax = maxCard(rightHand)
        return when {
            leftHandMax.rank > rightHandMax.rank ->
                "left hand wins. - with high card: " + leftHandMax.valueString()
            leftHandMax.rank < rightHandMax.rank ->
                "right hand wins. - with high card: " + rightHandMax.valueString()
            else -> "Tie."
        }
    }

    private fun pairVsNone(
        pairsInRightHand: List<List<Card>>,
        leftHandPair: List<Card>?,
        pairsInLeftHand: List<List<Card>>,
        rightHandPair: List<Card>?
    ) = when {
        pairsInRightHand.isEmpty() -> "left hand wins. - with pair: ${leftHandPair?.format()}"
        pairsInLeftHand.isEmpty() -> "right hand wins. - with pair: ${rightHandPair?.format()}"
        else -> null
    }

    private fun higherPair(
        leftHandPair: List<Card>,
        rightHandPair: List<Card>
    ): String? {
        val leftHandPairSum = leftHandPair.maxOf { it.rank }
        val rightHandPairSum = rightHandPair.maxOf { it.rank }
        return when {
            leftHandPairSum > rightHandPairSum -> "left hand wins. - with pair: ${leftHandPair.format()}"
            rightHandPairSum > leftHandPairSum -> "right hand wins. - with pair: ${rightHandPair.format()}"
            else -> null
        }
    }

    private fun evenPairs(
        leftHand: List<Card>,
        leftHandPair: List<Card>,
        rightHand: List<Card>,
        rightHandPair: List<Card>
    ): String {
        val nonPairHandLeftMax = maxCard(leftHand - leftHandPair)
        val nonPairHandRightMax = maxCard(rightHand - rightHandPair)
        return when {
            nonPairHandLeftMax.rank > nonPairHandRightMax.rank -> "left hand wins. - with even pair, higher card: ${nonPairHandLeftMax.valueString()}"
            nonPairHandLeftMax.rank < nonPairHandRightMax.rank -> "right hand wins. - with even pair, higher card: ${nonPairHandRightMax.valueString()}"
            else -> "Tie. - with even pair, even cars."
        }
    }

    private fun handPairs(leftHand: List<Card>): List<List<Card>> = leftHand
        .groupBy { it.rank }
        .values
        .filter { it.size == 2 }

    private fun maxCard(leftHand: List<Card>) =
        leftHand.fold(leftHand.first()) { acc, card ->
            if (acc.rank > card.rank) acc else card
        }
}