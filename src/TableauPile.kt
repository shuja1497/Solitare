/**
 * Created by shuja1497 on 3/12/18.
 */
class TableauPile(var cards: MutableList<Card>){
    // while initializing the tableau pile the last card must be face up
    init {
        cards.last().faceUp = true
    }

    fun addCards(newCards: MutableList<Card>): Boolean{

        // there must be cards else .last will give an error
        if (cards.size > 0) {
            // we need to compare the first new card and the last current cards list
            if (newCards.first().value == cards.last().value - 1 &&
                    checkSuits(newCards.first(), cards.last())) {
                cards.addAll(newCards)
                return true
            }
        }
        // if tableau pile is empty but the first card of newCard list is king then add the new cards
        else if (newCards.first().value == 12){
            cards.addAll(newCards)
            return true
        }
        return false
    }

    private fun checkSuits(c1: Card, c2: Card): Boolean {
        if ((redSuits.contains(c1.suit) && blackSuits.contains(c2.suit)) ||
                (blackSuits.contains(c1.suit) && redSuits.contains(c2.suit))){
            return true
        }
        return false
    }
}