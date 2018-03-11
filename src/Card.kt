/**
 * Created by shuja1497 on 3/11/18.
 */

// in kotlin we can only declare property .
// anytime we declare a variable in kotlin its a property
// val >> immutable
// var >> mutable
// constructor is made just after the class name

//Type 1 >>>
//class Card (value: Int, suit: String, faceUp: Boolean){
//    val value: Int = value
//    val suit: String = suit
//    var faceUp: Boolean = faceUp// each card should start face down
//}

// Type 2>>>
// if we add val and var then they will act as a property
val clubs = "Clubs"
val diamonds = "Diamonds"
val hearts = "Hearts"
val spades = "Spades"

val redSuits = arrayOf(diamonds, hearts)
val blackSuits = arrayOf(clubs, spades)

class Card (val value: Int, val suit: String, var faceUp: Boolean=false){
}

// init block can be created which will be called as soon as the
// constructor is called. >>> (for initialization purpose )