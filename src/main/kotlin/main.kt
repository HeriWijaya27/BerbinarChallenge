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
                println("suit jepang")
                val jepang = SuitJepang()
                jepang.startGame()
            }
            "2" -> {
                println("hompimpa")
                val hompimpa = Hompimpa()
                hompimpa.startGame()
            }
            "3" -> {
                //berhenti
                println("game selesai")
                isGameFinish = true

            }

        }
    }
}