fun showPole() {

    var printItem: (Int) -> Unit = {
        val item = when (it) {
            PLAYER_O -> "[$PLAYER_O_SIGNATURE]"         // нолик
            PLAYER_X -> "[$PLAYER_X_SIGNATURE]"         // крестик
            CELL_FREE -> "[ ]"        // свободно
            else -> "[error]"
        }
        print("$item ")
    }

    println()
    for (k in 0..2) {
        for (i in 0..2)
            printItem(pole[k * 3 + i])
        println()
    }
}