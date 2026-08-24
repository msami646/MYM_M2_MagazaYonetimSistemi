package ders8.alistirmalar.alistirma4

fun main() {
    val arac = ElektrikliOtonomArac()
    while (true){
        println("""
            Seçiminizi giriniz:
            1.İlerle
            2.Sarj et
            3.Çıkış
        """.trimIndent())
        val secim = readln().trim()
        when(secim){
            "1" -> arac.ilerle()
            "2" -> arac.sarjEt()
            "3" -> {
                println("Çıkılıyor...")
                break
            }
            else -> println("Geçersiz işlem")
        }

    }

}