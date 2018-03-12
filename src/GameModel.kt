/**
 * Created by shuja1497 on 3/11/18.
 */
// we need to create properties for each of our game objects.
class GameModel {
    val deck = Deck()
    val wastePile:MutableList<Card> = mutableListOf()
    val foundationPile = arrayOf(FoundationPile(clubs), FoundationPile(diamonds),
            FoundationPile(hearts), FoundationPile(spades))
    val tableauPiles = Array(7, { TableauPile()})

    fun resetGame(){
        wastePile.clear()
        foundationPile.forEach { it.reset() }
        deck.reset() // reset the deck to have all 52 cards and shuffle them.
        // setting up the tableau pile >> 1st pile contains 1, 2nd pile contains 2 .............. 7th pile contains 7

        // forEachIndexed takes both index and what is in that index .. two parameters therefore "it" cannot be used
        tableauPiles.forEachIndexed { index, tableauPile ->
            val cardsInPile: MutableList<Card> = Array(index+1, { deck.drawCard()}).toMutableList()
            tableauPiles[index] = TableauPile(cardsInPile)
        }
    }

    fun onDeckTap(){
        if (deck.cardsInDeck.size>0) {
            val card = deck.drawCard()
            card.faceUp = true
            wastePile.add(card)
        }else{
            // if deck is empty copy all the cards from the waste pile into the deck
            deck.cardsInDeck = wastePile.toMutableList()
            wastePile.clear()
        }
    }
}
