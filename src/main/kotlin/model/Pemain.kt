package model

data class Pemain(private val inputTangan: String) {
    val tangan: Tangan = when (inputTangan) {
        "batu" -> Tangan.Batu
        "kertas" -> Tangan.Kertas
        else -> Tangan.Gunting
    }
}