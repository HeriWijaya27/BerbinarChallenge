import model.Hompimpa
import model.SuitJepang

fun main() {
    //tampilan awal
    var isGameFinish = false
    while (!isGameFinish) {
        println("=============================")
        println("GAME SUIT VERSI TERMINAL")
        println("=============================")
        println("Pilih Game:")
        println("1. Suit Jepang")
        println("2. Hompimpa")
        println("3. Keluar Dari Game")
        println("=============================")

        when (readLine()) {
            "1" -> {
                println("Anda Memilih Game Suit Jepang")
                val jepang = SuitJepang()
                jepang.startGame()
            }
            "2" -> {
                println("Anda Memilih Game Hompimpa")
                val hompimpa = Hompimpa()
                hompimpa.startGame()
            }
            "3" -> {
                //berhenti
                println("Game Selesai")
                isGameFinish = true

            }

        }
    }
}