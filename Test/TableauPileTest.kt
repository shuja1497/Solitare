import org.junit.Test

import org.junit.Assert.*

/**
 * Created by shuja1497 on 3/12/18.
 */
class TableauPileTest {
    @Test
    fun addCards() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        val cards = mutableListOf(Card(11, hearts))

        // act
        tableauPile.addCards(cards)

        // assert
        assertEquals(2, tableauPile.cards.size)
    }

    @Test
    fun removeCards() {
    }

}