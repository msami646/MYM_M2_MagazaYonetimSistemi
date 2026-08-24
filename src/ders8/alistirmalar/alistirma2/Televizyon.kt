package ders8.alistirmalar.alistirma2

class Televizyon(marka: String) : EvAleti(marka) {
    override fun calis() {
        println("Televizyon açıldı. Ekran taranıyor")
    }
}