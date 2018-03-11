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
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(4,clubs),
                Card(3, diamonds), Card(2, spades)))

        // act
        tableauPile.removeCards(1) // will remove cards from index 1 to end of cardsList (i.e. 2)

        // assert
        assertEquals(mutableListOf(Card(4, clubs, true)), tableauPile.cards)// only 4 of clubs will be left
        // the cards should have equal values but they are not same cards . they are still different objects
        // for checking properties like these use "data" before class keyword
    }

}