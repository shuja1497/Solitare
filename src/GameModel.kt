/**
 * Created by shuja1497 on 3/11/18.
 */
// we need to create properties for each of our game objects.
class GameModel {
    val deck = Deck()
    val wastePile:MutableList<Card> = mutableListOf()
    val foundationPile = arrayOf(FoundationPile(clubs), FoundationPile(diamonds),
            FoundationPile(hearts), FoundationPile(spades))
    val tableauPile = Array(7, { TableauPile()})
}