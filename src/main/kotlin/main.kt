import model.Hompimpa

fun main() {
    //tampilan awal
    var isGameFinish = false
    while (!isGameFinish) {
        println("=============================")
        println("GAME SUIT VERSI TERMINAL")
        println("=============================")
        println("Pilih Game:")
        println("1. Suit Jepang")
        println("2. Suit Standar")
        println("3. Hompimpa")
        when (readLine()) {
            "1" -> {
                println("suit jepang")
                // panggil fungsi game
            }
            "2" -> {
                println("suit standar")
                // panggil fungsi game
            }
            "3" -> {
                println("hompimpa")
                val hompimpa = Hompimpa()
                hompimpa.startGame()
            }
            else -> {
                //berhenti
                println("game selesai")
                isGameFinish = true

            }

        }
    }
}