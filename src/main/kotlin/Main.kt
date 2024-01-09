const val PLAYER_X = 1
const val PLAYER_O = 2
const val PLAYER_X_SIGNATURE = 'X'
const val PLAYER_O_SIGNATURE = 'O'
const val CELL_FREE = 0
var pole = IntArray(9)
var isGame = true
var activePlayer = PLAYER_O

fun main() {
    while (isGame) {
        showPole()
        changeActivePlayer()
        move()
    }
}

fun changeActivePlayer() {
    activePlayer = when (activePlayer) {
        PLAYER_O -> PLAYER_X
        else -> PLAYER_O
    }
}

fun move() {
    print("Move player $activePlayer: ")
    val move = inputDigit()
    if (move == -1) isGame = false
    else pole[move] = activePlayer
}




