import org.junit.Test

/**
 * Created by shuja1497 on 3/13/18.
 */
class GameTest {
    @Test
    // let's see if we can get a king in the 1st foundPile.
    fun kingInFirstFoundationPile(){
        // arrange
        // it might take few games to get king on the 1st foundPile
        var numGames = 0
        val maxGames = 10000

        // act
        for (i in 1..maxGames){
            numGames++
            GameModel.resetGame()
            for (j in 1..100){
                GamePresenter.onDeckTap()
                GamePresenter.onWasteTap()
                GameModel.tableauPiles.forEachIndexed { index, tableauPile ->
                    GamePresenter.onTableauPileTap(index, tableauPile.cards.lastIndex)
                }
            }
            if (GameModel.foundationPiles[0].cards.size == 13){
                break
            }
        }

        // assert
        GameModel.debugPrint()
        println("# Games : $numGames")
        assert(numGames<maxGames)
    }
}