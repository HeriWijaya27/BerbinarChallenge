package model

class SuitJepang {
    fun startGame() {
        showUI()
        startBattle()
    }

    private fun showUI() {
        println("=================")
        println("GAME SUIT JEPANG VERSI TERMINAL")
        println("=================")
    }

    private fun startBattle() {

        println("1. Masukan Tangan Pemain 1: ")
        val inputTangan1 = readLine()?.lowercase() ?: ""
        println("2. Masukan Tangan Pemain 2: ")
        val inputTangan2 = readLine()?.lowercase() ?: ""
        val player1 = Pemain(inputTangan1)
        val player2 = Pemain(inputTangan2)


        if (inputTangan1.isNotEmpty() && inputTangan2.isNotEmpty()) {
            if (!isInputValid(inputTangan1)) {
                println("Kata yang anda masukan ke pemain 1 tidak sesuai")
                startBattle()
                return
            }
            if (!isInputValid(inputTangan2)) {
                println("Kata yang anda masukan ke pemain 2 tidak sesuai")
                startBattle()
                return
            }
        } else {
            startBattle()
            return
        }


        val hasil = hasilSuit(player1, player2)
        println(hasil)


    }

    private fun hasilSuit(pemain1: Pemain, pemain2: Pemain): String {
        return when (pemain1.tangan) {
            pemain2.tangan -> "DRAW"

            Tangan.Batu -> if (pemain2.tangan == Tangan.Kertas) "Pemain 2 Menang" else "Pemain 1 Menang"
            Tangan.Kertas -> if (pemain2.tangan == Tangan.Gunting) "Pemain 2 Menang" else "Pemain 1 Menang"
            Tangan.Gunting -> if (pemain2.tangan == Tangan.Batu) "Pemain 2 Menang" else "Pemain 1 Menang"
        }
    }

    private fun isInputValid(inputTangan: String): Boolean {
        return inputTangan == "batu" || inputTangan == "gunting" || inputTangan == "kertas"

    }
}

