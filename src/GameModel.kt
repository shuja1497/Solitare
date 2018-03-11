/**
 * Created by shuja1497 on 3/11/18.
 */
// we need to create properties for each of our game objects.
class GameModel {
    val deck = Deck()
    val wastePile:MutableList<Card> = mutableListOf()
    val foundationPile = arrayOf(FoundationPile("Clubs"), FoundationPile("Diamonds"),
            FoundationPile("Hearts"), FoundationPile("Spades"))
}