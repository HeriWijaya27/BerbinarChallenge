package model

class Hompimpa {
    private val playerArray = ArrayList<Player>()
    private val playerCount = 3

    fun startGame() {
        showUI()
        inputPlayer()
        calculateWinner()
    }

    private fun showUI() {
        println("=================")
        println("GAME HOMPIMPA VERSI TERMINAL")
        println("=================")
    }

    private fun calculateWinner() {
        val total = getTotal(playerArray)
        if (total % 3 == 1) {
            findWinner(1, playerArray)
        } else if (total % 3 == 2){
            findWinner(0, playerArray)
        }
        else {
            println("Permainan Seri!")
        }
    }

    private fun getTotal(playerArray: ArrayList<Player>): Int {
        var tempTotal = 0
        for (i in 0 until playerArray.size){
            tempTotal = tempTotal + playerArray[i].getChoiceValue()
        }
        return tempTotal
    }

    private fun findWinner(input: Int, playerArray: ArrayList<Player>){
        for (i in 0 until playerArray.size){
            if (playerArray[i].getChoiceValue() == input){
                println("Player ${i+1} Tereliminasi")
            }
        }
    }

    private fun inputPlayer() {
        for (i in 0 until playerCount) {
            println("Masukkan Pemain ${i + 1}")
            val playerInput = readLine()
            // hitam
            if (playerInput != null) {
                val playerValue = checkHand(playerInput)
                // 0 1 2
                playerArray.add(Player(playerInput,playerValue))
            }
        }
    }

    private fun checkHand(input: String): Int {
//        val isInputValid = false
//        while (isInputValid == false){
//
//        }
        return when (input) {
            "putih" -> {
                0
            }
            else -> {
                1
            }
        }
    }

}