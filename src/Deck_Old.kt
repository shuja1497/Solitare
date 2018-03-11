/**
 * Created by shuja1497 on 3/11/18.
 */
// will store all 52 cards needed and functions like shuffling and drawing a card .
class Deck_Old {
    // using val to make it immutable bcz the 52 card deck will remain the same
    //val cards: Array<Card> = arrayOf(Card(0,"Clubs"), Card(1, "Clubs"), ...... )
    // no need of new keyword
    val fn = fun (i: Int): Card{
        val value = i%13
        // when used instead of switch
        // it can work without an else statement but since we are initializing suit so some value must be provided
        val suit = when(i/13){
            0 -> "Clubs"
            1 -> "Diamonds"
            2 -> "Hearts"
            else -> "Spades"
        }
        return Card(value, suit)
    }

    // we can pass in an anonymous func in Array<>
    // this can be done by removing the function name and assigning the func to a variable
    // or simply write the whole func as a parameter .
    val cards: Array<Card> = Array(52, fn)
}