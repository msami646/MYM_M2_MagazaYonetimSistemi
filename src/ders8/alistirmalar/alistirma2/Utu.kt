package ders8.alistirmalar.alistirma2

class Utu(marka: String) : EvAleti(marka) {
    override fun calis() {
        println("Ütü çalışmaya başladı. Buhar hazır.")
    }
}