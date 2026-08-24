package ders8.alistirmalar.alistirma2

fun main() {
    print("Markasını girin: ")
    val markaGirdisi = readln().trim()

    val marka = if (markaGirdisi.isEmpty()) "Genel" else markaGirdisi

    println("1.Televizyon , 2.Ütü . Seçiminizi yapın")
    val secim = readln().trim()

    when(secim){
        "1" -> {
            val tv = Televizyon(marka)
            tv.calis()
        }
        "2" ->{
            val utu = Utu(marka)
            utu.calis()
        }
        else -> println("Geçersiz Seçim")
    }

}