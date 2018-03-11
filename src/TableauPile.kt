/**
 * Created by shuja1497 on 3/12/18.
 */
class TableauPile(var cards: MutableList<Card>){
    // while initializing the tableau pile the last card must be face up
    init {
        cards.last().faceUp = true
    }

    fun addCards(newCards: MutableList<Card>): Boolean{
        // we need to compare the first new card and the last current cards list
        if (newCards.first().value == cards.last().value - 1 &&
                checkSuits(newCards.first(), cards.last()))
    }

    private fun checkSuits(c1: Card, c2: Card): Boolean {

    }
}