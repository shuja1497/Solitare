/**
 * Created by shuja1497 on 3/11/18.
 */
class Deck {
// lambda expression ....removing function declaration
    // if there is a single parameter in lambda expression we can omit that
    // kotlin will automatically initialize that with the name "it"
    val cards: Array<Card> = Array(52, {Card(it % 13, getSuit(it))})

// single line function can be just written with one line
    private fun getSuit(i: Int): String = when(i/13){
            0 -> "Clubs"
            1 -> "Diamonds"
            2 -> "Hearts"
            else ->  "Spades"
        }
}

// data type is not necessary until kotlin can tell the right data type