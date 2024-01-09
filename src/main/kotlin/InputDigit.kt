fun inputDigit(): Int {

    val enteringDigit: () -> Int = {
        var value: Int
        while (true) {
            try {
                value = readLine()!!.toInt() - 1
                if(value == -1) break
                else if (value > pole.size) println("Very big!!! Repeat enter")
                else if (pole[value] != 0) println("This position is not empty")
                else break
            } catch (e: NumberFormatException) {
                println("Only digits!")
            }
        }
        value
    }
    return enteringDigit()
}